import java.util.Scanner;

public class MethodDemo {
  public static void main(String[] args){
    int a = 1;
    while (a != 0) {
      a = Add();
      System.out.println(a);

//    System.out.println("1 부터 10까지의 합은"+sum(1,10));
//    System.out.println("100부터 1000까지의 합은"+sum(100,1000));
//    System.out.println("1000부터 10000까지의 합은"+sum(1000,10000));
    }
  }
//  static int sum(int a,int b){
//    int c = 0;
//    for (int i = a; i <=b ; i++) {
//      c += i;
//    }
//    return 0;
//  }
    static int Add(){
    Scanner scanner = new Scanner(System.in);
    int num = 0;
    for (int i = 0; i < 2 ; i++) {
      System.out.println("두 숫자를 입력해 주세요 (0 미만 입력시 종료)");
      num += scanner.nextInt();
      if (num < 0){
        return 0;
      }
    }
    return num;
  }
}
