package us.codecraft.fizzBuzz.numbersayer;

import java.util.List;

/**
 * @author code4crafter@gmail.com
 * @date 14-5-6
 */
public class OrNumberSayer implements NumberSayer {

    private List<NumberSayer> sayers;

    protected OrNumberSayer(List<NumberSayer> sayers) {
        this.sayers = sayers;
    }

    @Override
    public String say(int number) {
        for (NumberSayer sayer : sayers) {
            String say = sayer.say(number);
            if (say != null) {
                return say;
            }
        }
        return null;
    }

    public OrNumberSayer or(NumberSayer numberSayer){
        sayers.add(numberSayer);
        return this;
    }
}
