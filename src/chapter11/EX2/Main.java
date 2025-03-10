package chapter11.EX2;

import java.util.HashSet;

public class Main {
  public static void main(String[] args) {
    HashSet<Person> set = new HashSet<>();

    set.add(new Person("김일공", 20));
    set.add(new Person("최고봉",56));
    set.add(new Person("우등생",16));
    set.add(new Person("나자바",35));
    set.add(new Person("나자바",35));

    set.forEach(person -> {
      System.out.println(person.name);
    });
  }
}
