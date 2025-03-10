package chapter9.EX1;

public class Box<T> {
  private T box;
  void set(T box){
    this.box = box;
  }
  T get(){
    return box;
  }
}
