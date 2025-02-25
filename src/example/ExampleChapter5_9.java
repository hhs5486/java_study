package example;

import java.util.Scanner;

public class ExampleChapter5_9 {
  public static void main(String[] args) {
    student.Smain();
  }
}

class student {
  static void Smain() {
    Scanner scanner = new Scanner(System.in);
    int[] studentArray = null;
    boolean run = true;
    int hight = 0, total = 0;
    while (run) {
      System.out.println("""
          ------------------------------------------------
          1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료
          ------------------------------------------------
          """);
      System.out.print("선택>");
      switch (scanner.nextInt()) {

        case 1:
          System.out.print("학생수>");
          studentArray = new int[scanner.nextInt()];
          break;

        case 2:
          studentCK(studentArray);
          for (int i = 0; i < studentArray.length; i++) {
            System.out.print("scores[" + i + "]>");
            studentArray[i] = scanner.nextInt();
          }
          break;

        case 3:
          studentCK(studentArray);
          for (int i = 0; i < studentArray.length; i++) {
            System.out.println("scores[" + i + "]:" + studentArray[i]);
          }
          break;

        case 4:
          studentCK(studentArray);
          for (int i = 0; i < studentArray.length; i++) {
            if (studentArray[i] > hight) {
              hight = studentArray[i];
            }
            total += studentArray[i];
          }
          System.out.println("최고 점수: " + hight);
          System.out.println("평균 점수: " + total / studentArray.length);
          break;

        case 5:
          run = false;
          break;
        default:
          break;
      }
    }
  }
  static void studentCK(int[] studentArray){
    if (studentArray == null) {
      System.out.println("학생수를 입력해 주세요");
      Smain();
    }
  }
}

