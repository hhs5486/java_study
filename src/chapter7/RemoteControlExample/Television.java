package chapter7.RemoteControlExample;

public class Television implements RemoteControl{

  @Override
  public void turnOn() {
    System.out.println("TV를 켭니다.");
  }

  @Override
  public void turnOff() {

  }

  @Override
  public void setVolume(int volume) {

  }
}
