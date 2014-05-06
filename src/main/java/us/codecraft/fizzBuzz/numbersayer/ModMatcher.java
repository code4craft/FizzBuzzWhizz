package us.codecraft.fizzBuzz.numbersayer;

/**
 * @author code4crafer@gmail.com
 */
public class ModMatcher implements Matcher {

    private int divisor;

    private int remainder;

    protected ModMatcher(int divisor, int remainder) {
        this.divisor = divisor;
        this.remainder = remainder;
    }

    @Override
    public boolean isMatch(int number) {
        return number % divisor == remainder;
    }

}
