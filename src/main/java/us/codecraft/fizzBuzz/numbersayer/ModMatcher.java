package us.codecraft.fizzBuzz.numbersayer;

/**
 * @author code4crafer@gmail.com
 */
public class ModMatcher extends NumberSayerBuildMatcher {

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

    public static class Mod {
        private int divisor;

        protected Mod(int divisor) {
            this.divisor = divisor;
        }

        public ModMatcher is(int remainder) {
            return new ModMatcher(divisor, remainder);
        }

    }
}
