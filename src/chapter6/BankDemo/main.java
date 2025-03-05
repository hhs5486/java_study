package chapter6.BankDemo;

import java.util.Scanner;

public class main {

  public static void main(String[] args) {
    String Select_num;
    Scanner scanner = new Scanner(System.in);
    BankApplication bankApplication = new BankApplication();
    boolean Crun = true;
    while (Crun){
      System.out.println("""
        ----------------------------------------------
        1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료
        ----------------------------------------------
        """);
      System.out.print("선택>");
      switch (scanner.nextInt()){
        case 1:
          bankApplication.adduser();
          break;
        case 2:
          bankApplication.SELECT_Account();
          break;
        case 3:
          System.out.print("계좌번호: ");
          Select_num = scanner.next();
          System.out.print("예금액: ");
          int add_num = scanner.nextInt();
          bankApplication.edit_Account(Select_num,add_num,true);
          break;
        case 4:
          System.out.print("계좌번호: ");
          Select_num= scanner.next();
          System.out.print("출금액: ");
          int remove_num = scanner.nextInt();
          bankApplication.edit_Account(Select_num,remove_num,false);
          break;
        case 5:
          Crun = false;
          break;
        default:
          break;
    }
    }
  }
}
