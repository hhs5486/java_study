package chapter6.InheritanceDemo;

public class Ball extends Circle {
  private String color;
  public Ball(double radius, String color){
   this.color = color;
   super.radius = radius;
  }
  public String findColor(){
    return color;
  }

  public void findVolume(){
    System.out.println("부피는 "+4*(Math.PI)*radius*radius*radius);
  }
}
