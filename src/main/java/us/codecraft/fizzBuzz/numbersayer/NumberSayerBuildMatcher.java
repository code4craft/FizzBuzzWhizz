package us.codecraft.fizzBuzz.numbersayer;

/**
 * @author code4crafer@gmail.com
 */
public abstract class NumberSayerBuildMatcher implements Matcher {

    public MatchNumberSayer thenReturn(String word) {
        return new MatchNumberSayer(this, word);
    }
}
