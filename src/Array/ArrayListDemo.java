package Array;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListDemo {
  public static void main(String[] args) {

//    ArrayList<String> names = new ArrayList<>();
//    names.add("kim");
//    names.add("lee");
//    names.add("park");
//
//    System.out.println(names.toString());
//    System.out.println(names.size());
//
//    for (int i = 0; i < names.size(); i++) {
//      String name =names.get(i);
//      if (name != null && name.length() == 4) {
//        names.remove(i);
//        names.add(i, name.substring(1,name.length())) ;
//      }
//    }
//    System.out.println(names.toString());
    Scanner sc = new Scanner(System.in);
    ArrayList<Integer> scores= new ArrayList<>();
    int total = 0;
    int avg,score = 0;

    for (int i = 1; true; i++) {
      System.out.println("점수를 입력하세요 (" + i + "번째) -1 입력시 종료");
      score = sc.nextInt();
      if (score == -1){
       break;
      }
      scores.add(score);
    }

    for (int i = 0; i < scores.size(); i++) {
      total += scores.get(i);
    }
    avg = total/scores.size();
    System.out.println("scores:"+scores.toString());
    System.out.println("총합:"+total);
    System.out.println("평균:"+avg);
  }
}
