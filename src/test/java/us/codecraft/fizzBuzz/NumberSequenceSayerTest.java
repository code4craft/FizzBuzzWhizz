package us.codecraft.fizzBuzz;

import org.junit.Test;

import static us.codecraft.fizzBuzz.numbersayer.NumberSayers.*;

/**
 * @author code4crafter@gmail.com
 * @date 14-5-6
 */
public class NumberSequenceSayerTest {

    @Test
    public void testAll() throws Exception {
        NumberSequenceSayer numberSequenceSayer = NumberSequenceSayerBuilder.custom()
           .setNumberSayer(
               or(contains(3).thenReturn("Fizz"))
                   .or(
                       concat(
                          mod(3).is(0).thenReturn("Fizz"),
                          mod(5).is(0).thenReturn("Buzz"),
                          mod(7).is(0).thenReturn("Whizz")
                       )
                   )
                   .or(echoInputNumber())
           )
           .setStartNumber(1).setEndNumber(100).get();
        System.out.println(numberSequenceSayer.say());
    }
}
