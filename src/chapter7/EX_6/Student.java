package chapter7.EX_6;

public class Student implements Human{
  int age;
  Student(int age){
    this.age = age;
  }

  @Override
  public void eat() {
    System.out.println("도시락을 먹습니다.");
  }

  @Override
  public void print(){
    System.out.println(age+"세의 학생입니다.");
  }
}
