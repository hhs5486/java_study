import java.util.Scanner;

public class WhileDemo2 {
  public static void main(String[] args) {
    demo();
  }
  static void demo(){
    Scanner sc = new Scanner(System.in);
    while (true){
      System.out.println("동물 이름을 입력하세요. (종료하려면 stop 을 입력하세요):");
      String animal = sc.nextLine();
      if (animal.equalsIgnoreCase("stop")){
        break;
      }
      Switch1Demo.wholslt(animal);
    }
  }
}
