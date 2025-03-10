package chapter11.EX2;

import java.util.Objects;

public class Person {
  int age;
  String name;
  Person(String name, int age){
    this.age = age;
    this.name = name;
  }

  @Override
  public boolean equals(Object obj) {
    if (obj instanceof  Person) {
      return Objects.hashCode(name) == Objects.hashCode(((Person)obj).name);
    } else {
      return false;
    }
  }

  @Override
  public int hashCode() {
    return Objects.hash(name);
  }

  @Override
  public String toString() {
    return "Person["+name+" : "+age+"] ";
  }
}
