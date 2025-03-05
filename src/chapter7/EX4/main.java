package chapter7.EX4;

public class main {
  static void speak(Talkable talkable){
    talkable.talk();
  }
  public static void main(String[] args) {
    speak(new Korean());
    speak(new American());
  }
}
