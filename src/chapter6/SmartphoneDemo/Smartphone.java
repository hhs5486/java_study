package chapter6.SmartphoneDemo;

public class Smartphone extends Phone{
  private String game;
  public Smartphone(String owner,String game) {
    super(owner);
    this.game = game;
  }
  void playGame(){
    System.out.println(super.owner+"가 "+game+"중입니다.");
  }
}
