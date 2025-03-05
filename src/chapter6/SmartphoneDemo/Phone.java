package chapter6.SmartphoneDemo;

public class Phone {
  public Phone(String owner){
    this.owner = owner;
  }
  protected String owner;
  void talk(){
    System.out.println(owner+"가 통화 중");
  }
}
