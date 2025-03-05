package chapter7.RemoteControlExample;

public class main {
  public static void main(String[] args) {
    RemoteControl remoteControl;
    remoteControl = new Audio();
    remoteControl.setVolume(100);
    remoteControl.setMute(true);
    remoteControl.setMute(false);
  }
}
