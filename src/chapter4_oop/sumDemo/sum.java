package chapter4_oop.sumDemo;

public class sum {
  int sum(int b ,int... a){
    int total = 0;
    for (int i = 0; i < a.length; i++) {
      total += a[i];
    }
    return  total;
  }
}
