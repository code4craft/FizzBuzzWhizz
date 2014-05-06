package us.codecraft.fizzBuzz.numbersayer;

/**
 * @author code4crafter@gmail.com
 * @date 14-5-6
 */
public class MatchNumberSayer implements NumberSayer {

    private Matcher matcher;

    private final String mapWord;

    protected MatchNumberSayer(Matcher matcher, String mapWord) {
        this.matcher = matcher;
        this.mapWord = mapWord;
    }

    public String getMapWord() {
        return mapWord;
    }

    @Override
    public String say(int number) {
        if (matcher.isMatch(number)) {
            return getMapWord();
        } else {
            return null;
        }
    }

}
