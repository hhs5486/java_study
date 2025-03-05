package chapter6.BankDemo;

import java.util.Scanner;

public class BankApplication {
  Scanner scanner =new Scanner(System.in);
  private Account[] AccountIF = new Account[100];
  public void add_Account(String AccountNum,  String AccountName, int DefaultAccount){
    for (int i = 0; i < AccountIF.length; i++) {
      if (AccountIF[i] == null){
        AccountIF[i] = new Account(AccountNum,AccountName,DefaultAccount);
        System.out.println(AccountIF[i].AccountNum);
        break;
      }
    }
  }
  public void SELECT_Account(){
    System.out.println("""
              ---------
              계좌목록
              ---------
              """);
    for (Account account: AccountIF) {
      if (account != null){
        System.out.println(account.AccountNum+"   "+account.AccountName+"   "+account.DefaultAccount);
      }
    }
  }
  public void edit_Account(String Account_name,int Account_Remove, boolean add_remove){
    for (Account account: AccountIF) {
      if (account != null){
        if (account.AccountName.equals(Account_name) && add_remove){
          account.DefaultAccount += Account_Remove;
        }
        if (account.AccountName.equals(Account_name) && ! add_remove){
          account.DefaultAccount -= Account_Remove;
        }
      }
    }
  }
  public void adduser (){
    String AccountNum , AccountName;
    int DefaultAccount;
    System.out.println("""
              ---------
              계좌생성
              ---------
              """);
    System.out.print("계좌번호:");
    AccountNum=scanner.next();
    System.out.print("계좌주:");
    AccountName = scanner.next();
    System.out.print("초기입금액:");
    DefaultAccount = scanner.nextInt();

    add_Account(AccountNum,AccountName,DefaultAccount);
  }
}
