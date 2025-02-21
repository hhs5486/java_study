public class NumberTypeDemo {

  //정수를 선언하고 사용
  long mach = 340;
  long distance = mach*60*60;
  //실수를 선언하고 사용
  float radius = 10.0F;
  float PI= 3.14159265F;
  float area = radius*PI;
  // 논리, boolean 값
  int x = 10;
  boolean result = x == 10;
  void a(){
    System.out.println("소리가 1시간 동안 가는 거리 :"+distance);
    // 문자열과 숫자를 더하면 ==> 문자열
    System.out.println("반지름이"+radius+"인 원의 넓의 :"+area);
  }
}
