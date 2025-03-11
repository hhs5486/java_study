package chapter11.EX3;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

  Map<String, Integer> map = new Hashtable<>();
  map.put("김열공",80);
  map.put("최고봉",80);
  map.put("우등생",80);
  map.put("나자바",80);

    Scanner scanner = new Scanner(System.in);
    System.out.println(map.get(scanner.next()));

  }

}
