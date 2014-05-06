package us.codecraft.fizzBuzz.numbersayer;

/**
 * @author code4crafter@gmail.com
 * @date 14-5-6
 */
public class EchoNumberSayer implements NumberSayer {

    @Override
    public String say(int number) {
        return String.valueOf(number);
    }
}
