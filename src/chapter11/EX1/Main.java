package chapter11.EX1;

import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    ArrayList<String> arr= new ArrayList<>();
    arr.add("갈매기");
    arr.add("나비");
    arr.add("다람쥐");
    arr.add("라마");

    arr.forEach(s -> {
      if (s.length()==2) {
        System.out.println(s);
      }
    });

  }
}
