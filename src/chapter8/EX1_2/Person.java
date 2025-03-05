package chapter8.EX1_2;

import java.util.Objects;

public class Person {
  String num,name;

  Person(String num, String name){
    this.num = num;
    this.name = name;
  }

  @Override
  public boolean equals(Object obj) {
    return  this.hashCode() == ((Person)obj).hashCode();
  }

  @Override
  public int hashCode() {
    return Objects.hashCode(name+num);
  }
}
