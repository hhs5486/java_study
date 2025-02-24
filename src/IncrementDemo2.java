public class IncrementDemo2 {
  public static void main(String[] args) {
    RefValue refValue = new RefValue();
    refValue.x = 10;
    System.out.println(refValue.x);
    changePrimitlive(refValue.x);
    System.out.println(refValue.x);
  }

  static void  changePrimitlive(int x){

  }

  static void changeReference(RefValue refValue){
    refValue.x = 10;
  }
}
class RefValue{
  int x;
}
