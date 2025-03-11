package chapter12;

import java.util.Random;
import java.util.stream.IntStream;

public class LazyDemo {
  public static void main(String[] args) {
    IntStream.generate(()-> {
          return new Random().nextInt(10);
    })
        .filter((x)->x%2 != 0)
        .map(x -> x*2)
        .forEach(s-> System.out.println(s));
  }
}
