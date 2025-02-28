package URLDemo;

import java.util.Scanner;

public class main {
  public static void main(String[] args) {
    String URL;
    while (true){
      Scanner scanner = new Scanner(System.in);
      System.out.print("URL을 입력하세요 : ");
      URL = scanner.next();
      if (URL.equals("bye")){
        break;
      }
      URLC urlc = new URLC(URL);
    }
  }
}
