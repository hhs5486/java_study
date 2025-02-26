package chapter4_oop;

public class Ball {
  double radius = 2.0;
  double getRadius(){
    return 4/3 * 3.14 *radius*radius*radius;
  }
  static void print(){
    System.out.println("공입니다.");
  }
}
