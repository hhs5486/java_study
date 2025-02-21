import java.util.Scanner;

public class WhileDemo1 {
  public static void main(String[] args) {
    demo();
  }
    static void demo(){
      while (true){
        Scanner sc = new Scanner(System.in);
        System.out.println("출력할 구구단을 입력하세요");
        int dan = sc.nextInt();
        if (dan<2||dan>9){
          break;
        }
        ForDemo1.gogodan(dan);
      }
    }
}
