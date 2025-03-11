package chapter11;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapExample {
  public static void main(String[] args) {

    int maxScore = 0;
    int ave =0;
    int totalScore = 0;

    Map<String,Integer> map = new HashMap<String,Integer>();
    map.put("blue",96);
    map.put("hong",86);
    map.put("white",92);

    String name = "";
    map.get("blue");

    Iterator<String> keys = map.keySet().iterator();
    while (keys.hasNext()){
      String nowKey = keys.next();
      int keyValue = map.get(nowKey);
      totalScore= + keyValue;
      if (keyValue > maxScore){
        maxScore = keyValue;
        name = nowKey;
      }
    }
    ave = totalScore/map.size();

    System.out.println("평균점수:"+ ave);
    System.out.println("최고점수:"+ maxScore);
    System.out.println("최고 점수를 받는 아이디:"+ name);





  }
}
