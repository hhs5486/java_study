import java.util.Scanner;

public class MethodDemo {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    while (true){
      System.out.println("두 숫자를 입력해 주세요 (0 미만 입력시 종료)");
      int Fnum = scanner.nextInt();
      if (Fnum < 0){
        break;
      }

      int Snum = scanner.nextInt();
      if (Snum < 0){
        break;
      }

      System.out.println(add(Fnum,Snum));
    }
//    System.out.println("1 부터 10까지의 합은"+sum(1,10));
//    System.out.println("100부터 1000까지의 합은"+sum(100,1000));
//    System.out.println("1000부터 10000까지의 합은"+sum(1000,10000));
  }
  static int sum(int a,int b){
    int c = 0;
    for (int i = a; i <=b ; i++) {
      c += i;
    }
    return 0;
  }

  static int add(int Fnum ,int Snum){
    return Fnum+Snum;
  }
}
