package chapter9.EX2;

public class Person <T1,T2>{

  private T1 t1;
  private T2 t2;

  Person(T1 t1, T2 t2){
    this.t1 = t1;
    this.t2 = t2;
  }
  T1 getKey(){
    return t1;
  }
  T2 getValue(){
    return t2;
  }
}
