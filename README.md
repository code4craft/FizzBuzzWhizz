FizzBuzzWhizz
=============

Practice in OOP for thoughtworks quiz [FizzBuzzWhizz](https://www.jinshuju.net/f/EGQL3D). 

### API:

```java
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
```

### Internal:

#### `NumberSayer`

A strategy to say a number. Can be composite to `CompositeNumberSayer` and `OrNumberSayer`.

```java
public interface NumberSayer {

    /**
     * Say a number
     * @param number
     * @return
     */
    public String say(int number);
}
```

#### `NumberSequenceSayer`

Entire flow of numbers.

```java
public class NumberSequenceSayer {

    private final NumberSayer numberSayer;

    private final int startNumber;

    private final int endNumber;

    private static String SEPARATOR = System.getProperty("line.separator");

    public NumberSequenceSayer(NumberSayer numberSayer, int startNumber, int endNumber) {
        this.numberSayer = numberSayer;
        this.startNumber = startNumber;
        this.endNumber = endNumber;
    }

    public String say() {
        StringBuilder accum = new StringBuilder();
        for (int i = startNumber; i <= endNumber; i++) {
            String say = numberSayer.say(i);
            if (say != null) {
                accum.append(say).append(SEPARATOR);
            }
        }
        return accum.toString();
    }
}
```

Detail in blog:

[http://my.oschina.net/flashsword/blog/261140](http://my.oschina.net/flashsword/blog/261140)