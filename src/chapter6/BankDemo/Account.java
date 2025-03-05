package chapter6.BankDemo;

public class Account{
  protected int DefaultAccount, MIN_BALANCE = 0, MAX_BALANCE =1000000;
  protected String AccountName;
  protected String AccountNum;
  protected Account(String AccountNum, String AccountName, int DefaultAccount){
    this.AccountName = AccountName;
    this.AccountNum = AccountNum;
    if (DefaultAccount < MAX_BALANCE&& DefaultAccount > MIN_BALANCE){
      this.DefaultAccount = DefaultAccount;
    }
  }
}
