package chapter6.SmartphoneDemo;

public class main {
  public static void main(String[] args) {
    Phone[] phones = {new Phone("황진이"), new Telephone("길동이","내일"),new Smartphone("민국이","갤러그")};

    phones[0].talk();
    ((Telephone)phones[1]).autoAnswering();
    ((Smartphone)phones[2]).playGame();
  }
}
