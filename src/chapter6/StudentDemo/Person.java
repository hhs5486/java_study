package chapter6.StudentDemo;

public class Person {
  private String name;
  private int age;
  public Person(String name, int age){
    this.name = name;
    this.age = age;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }
  void show(){
    System.out.println("사람[이름: "+name+", 나이:"+age+"]");
  }
}
