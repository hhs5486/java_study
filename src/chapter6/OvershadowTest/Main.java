package chapter6.OvershadowTest;

public class Main {
  public static void main(String[] args) {
    Parent p = new Child();
    System.out.println(p.name);
    p.print();

  }
}
