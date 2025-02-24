public class MethodOverDverloadingDemo {
  public static void main(String[] args) {
    add2Numbers(1,2);
    add2Numbers(1,2,3);
    add2Numbers(1,2,3,4);
    addNumbers(1,2,3,4,5,6);
  }

  private static void add2Numbers(int i, int i1, int i2, int i3) {
    System.out.println(i+i1+i2+i3);
  }

  private static void add2Numbers(int i, int i1, int i2) {
    System.out.println(i+i1+i2);
  }
  private static void add2Numbers(int i, int i1) {
    System.out.println(i+i1);
  }

  private static void addNumbers(int... number){
    int result=0;
    for (int i = 0; i < number.length; i++) {
      result+=number[i];
    }
    System.out.println(result);
  }
}
