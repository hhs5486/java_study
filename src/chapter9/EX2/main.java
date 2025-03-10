package chapter9.EX2;

public class main {
  public static void main(String[] args) {
    //person 문자 이름과 숫자 나이
    //person (주민번호와 이름)
    Person<String,Integer> person = new Person<>("이름",10);
    System.out.println(person.getKey());
  }
}
