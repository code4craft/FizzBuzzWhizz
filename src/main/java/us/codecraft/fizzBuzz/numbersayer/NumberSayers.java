package us.codecraft.fizzBuzz.numbersayer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author code4crafter@gmail.com
 * @date 14-5-6
 */
public abstract class NumberSayers {

    public static ConcatNumberSayer concat(NumberSayer... numberSayerArray) {
        List<NumberSayer> numberSayerList = new ArrayList<NumberSayer>(numberSayerArray.length);
        for (NumberSayer numberSayer : numberSayerArray) {
            numberSayerList.add(numberSayer);
        }
        return new ConcatNumberSayer(numberSayerList);
    }

    public static OrNumberSayer or(NumberSayer... sayerArray) {
        List<NumberSayer> numberSayers = new ArrayList<NumberSayer>(sayerArray.length);
        for (NumberSayer numberSayer : sayerArray) {
            numberSayers.add(numberSayer);
        }
        return new OrNumberSayer(numberSayers);
    }

    public static ModMatcher.Mod mod(int divisor) {
        return new ModMatcher.Mod(divisor);
    }

    public static NumberSayerBuildMatcher contains(int matchNumber) {
        return new LiteralContainsMatcher(matchNumber);
    }

    public static NumberSayer echoInputNumber() {
        return new EchoNumberSayer();
    }

}
