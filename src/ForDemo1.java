import java.util.Scanner;

public class ForDemo1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("구구단을 지정하세요");
    int count = sc.nextInt();
    gogodan(count);
  }
  static void gogodan(int count){
    for (int i = 1; i < 10; i++) {
      System.out.println(count+"x"+i+"="+count*i);
    }
  }
}
