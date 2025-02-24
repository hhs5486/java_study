public class echoDemo {
  public static void main(String[] args) {
    echo("안녕",3);
  }
  static void echo(String a, int b){
    for (int i = 0; i < b; i++) {
      System.out.println(a);
    }
  }
}
