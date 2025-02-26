package chapter4_oop;

public class Balldemo2 {
  public static void main(String[] args) {
    //1
    int ten = 10;
    Ball ball1 = new Ball();
    //2
    Ball ball2 = new Ball();
    Ball ball3 = new Ball();
    //3
    Ball yourBall = new Ball();
    Ball myBall = yourBall;
  }
}
