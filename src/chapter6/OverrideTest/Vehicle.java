package chapter6.OverrideTest;

public class Vehicle {
  public Vehicle(String color, int speed){
    this.color = color;
    this.speed = speed;
  }
  String color;
  int speed;
  void show(){
    System.out.print("color:"+color+" speed:"+speed);
  }
}
