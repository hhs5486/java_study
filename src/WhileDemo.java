public class WhileDemo {
  public static void main(String[] args) {
    MultifDemo multifDemo = new MultifDemo();
    Sniffling sniffling = new Sniffling();
    int score = sniffling.Int();
    while (score >= 0){
      System.out.println(multifDemo.judgment(score));
      score = sniffling.Int();
    }

  }
}
