package chapter6.CirleDemo;

public class ColoredCircle extends Circle{

  ColoredCircle(int radius,String color) {
    super(radius);
    this.color = color;
  }
  String color;

  @Override
  void show(){
    super.show();
    System.out.println("반지름이 "+radius+"인"+color+" 원이다. ");
  }
}
