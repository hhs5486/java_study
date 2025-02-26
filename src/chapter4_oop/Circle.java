package chapter4_oop;

public class Circle {
  private double radius;
  public Circle(double radius){
    if (radius <= 0){
      this.radius = 1.0;
    }
  }

  public void setRadius(double radius) {
    if (radius <= 0) {
      System.out.println("원의 반지름은 0보다 커야 합니다.");
      return;
    }
    this.radius = radius;
  }

  public double getRadius() {
    return radius;
  }

  double findArea(){
    final  double PI = 3.141592653589793;
    return  PI *radius*radius;
  }
  void show(){
    System.out.println(findArea());
  }
}
