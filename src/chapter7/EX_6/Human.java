package chapter7.EX_6;

public interface Human {
  default void eat(){
    System.out.println("빵을 먹습니다,");
  };

  default void print(){
    System.out.println("인간입니다.");
  };

  static void echo(){
    System.out.println("야호 !!!");
  }

}
