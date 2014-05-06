package us.codecraft.fizzBuzz;

import us.codecraft.fizzBuzz.numbersayer.NumberSayer;

/**
 * @author code4crafter@gmail.com
 * @date 14-5-6
 */
public class NumberSequenceSayerBuilder {

    private NumberSayer numberSayer;

    private int startNumber;

    private int endNumber;

    private NumberSequenceSayerBuilder() {
    }

    public static NumberSequenceSayerBuilder custom(){
        return new NumberSequenceSayerBuilder();
    }

    public NumberSequenceSayerBuilder setNumberSayer(NumberSayer numberSayer) {
        this.numberSayer = numberSayer;
        return this;
    }

    public NumberSequenceSayerBuilder setStartNumber(int startNumber) {
        this.startNumber = startNumber;
        return this;
    }

    public NumberSequenceSayerBuilder setEndNumber(int endNumber) {
        this.endNumber = endNumber;
        return this;
    }

    public NumberSequenceSayer get() {
        return new NumberSequenceSayer(numberSayer, startNumber, endNumber);
    }
}
