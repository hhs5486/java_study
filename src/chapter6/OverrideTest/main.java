package chapter6.OverrideTest;

public class main {
  public static void main(String[] args) {
    Car c = new Car("파랑",200,1000,5);
    c.show();

    ((Vehicle)c).show();
  }
}
