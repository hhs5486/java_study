package chapter6.OverrideTest;

public class Car extends Vehicle{
  int displacemtent;
  int gears;

  public Car(String color, int speed, int displacemtent, int gears) {
    super(color, speed);
    this.displacemtent =displacemtent;
    this.gears = gears;
  }

  @Override
  void show(){
    super.show();
    System.out.println(" displacemtent:"+displacemtent+" gears:"+gears);
  }
}
