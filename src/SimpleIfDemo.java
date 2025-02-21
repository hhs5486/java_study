import java.util.InputMismatchException;
import java.util.Scanner;

public class SimpleIfDemo {
  public static void main(String[] args) {
    Sniffling sniffling = new Sniffling();
    MultifDemo multifDemo = new MultifDemo();

//    System.out.println(sniffling.sniffling(sniffling.Int()));
    System.out.println("당신의 학점은:"+multifDemo.judgment(sniffling.Int()));
  }
}

class Sniffling{
  String sniffling(int a){
    if (a%2 == 0){
      return "짝수입니다.";
    }
    else {
      return "홀수입니다.";
    }
  }
  int Int() {
    System.out.println("정수를 입력하세요(0~100)");
    try {
      Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
      if (a>0 && a<=100){
        return Int();
      }
      return a;
    } catch (InputMismatchException e1) {
      System.out.println("정수가 아닙니다.");
      return Int();
    }
  }
}

class MultifDemo{
  String judgment(int a){
    if (a>=90){
      if (a>=95){
        return "A+";
      }
      return "A";
    }
    if (a>=80){
      return "B";
    }
    if (a>=70){
      return "C";
    }
    if (a>=60){
      return "D";
    }
    return "F";
  }
}

