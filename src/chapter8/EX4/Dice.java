package chapter8.EX4;

import java.util.Random;

public class Dice {
  int roll(){
    Random random = new Random();
    return random.nextInt(6)+1;
  }
}
