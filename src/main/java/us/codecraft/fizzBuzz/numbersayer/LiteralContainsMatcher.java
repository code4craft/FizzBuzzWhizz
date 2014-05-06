package us.codecraft.fizzBuzz.numbersayer;

/**
 * @author code4crafer@gmail.com
 */
public class LiteralContainsMatcher extends NumberSayerBuildMatcher {

    private int matchNumber;

    public LiteralContainsMatcher(int matchNumber) {
        this.matchNumber = matchNumber;
    }

    @Override
    public boolean isMatch(int number) {
        return String.valueOf(number).contains(String.valueOf(matchNumber));
    }
}
