FizzBuzzWhizz
=============

Practice in OOP for thoughtworks quiz [FizzBuzzWhizz](https://www.jinshuju.net/f/EGQL3D). 

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