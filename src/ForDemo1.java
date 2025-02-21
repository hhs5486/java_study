import java.util.Scanner;

public class ForDemo1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("구구단을 지정하세요");
    int count = sc.nextInt();
    for (int i = 1; i < 10; i++) {
      for (int j = 1; j < 10; j++) {
        System.out.println(i+"X"+j+"="+i*j);
      }
    }
  }
}
