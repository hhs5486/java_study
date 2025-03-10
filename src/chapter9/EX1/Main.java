package chapter9.EX1;

public class Main {
  public static void main(String[] args) {
    Box<Integer> i = new Box<>();
    i.set(Integer.valueOf(100));
    System.out.println(i.get());
    Box<String> s = new Box<>();

  }
}
