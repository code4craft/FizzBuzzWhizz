FizzBuzzWhizz
=============

Practice in OOP for thoughtworks quiz [FizzBuzzWhizz](https://www.jinshuju.net/f/EGQL3D). 

```java
 NumberSequenceSayer numberSequenceSayer = NumberSequenceSayerBuilder.custom().setNumberSayer(
                or(
                    contains(3, "Fizz"),
                    all(mod(3, "Fizz"), mod(5, "Buzz"), mod(7, "Whizz")),
                    echo()
                )
             ).setStartNumber(1).setEndNumber(100).get();
        System.out.println(numberSequenceSayer.say());
```