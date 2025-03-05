package chapter6.StudentDemo;

public class main {
  public static void main(String[] args) {
    Person[] people = new Person[3];
    people[0] = new ForeignStudent("홍길동",10,203,"한국");
    people[1] = new Person("홍길동",10);
    people[2] = new Student("홍길동",10,203);


    for (Person string : people) {
      string.show();
    }
  }
}
