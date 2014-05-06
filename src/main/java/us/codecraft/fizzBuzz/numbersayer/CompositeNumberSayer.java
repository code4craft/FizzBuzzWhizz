package us.codecraft.fizzBuzz.numbersayer;

import java.util.List;

/**
 * @author code4crafter@gmail.com
 * @date 14-5-6
 */
public class CompositeNumberSayer implements NumberSayer {

    private List<NumberSayer> numberSayers;

    protected CompositeNumberSayer(List<NumberSayer> numberSayers) {
        this.numberSayers = numberSayers;
    }

    @Override
    public String say(int number) {
        StringBuilder accum = new StringBuilder();
        for (NumberSayer numberSayer : numberSayers) {
            String say = numberSayer.say(number);
            if (say != null) {
                accum.append(say);
            }
        }
        if (accum.length() > 0) {
            return accum.toString();
        } else {
            return null;
        }
    }
}
