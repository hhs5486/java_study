package chapter4_oop;

public class Person {
  private String name;
  private int age;
  public Person setAge(int age) {
    this.age = age;
    return this;
  }

  public int getAge() {
    return age;
  }

  public Person setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  void sayHello(){

  }
}
