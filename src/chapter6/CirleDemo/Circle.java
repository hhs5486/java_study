package chapter6.CirleDemo;

public class Circle {
  Circle(int radius){
    this.radius = radius;
  }
  int radius;

  void show(){
    System.out.println("반지름이" + radius + "인 원이다.");
  }
}
