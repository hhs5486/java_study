package chapter6.StudentDemo;

public class Student extends Person {
  private int classnum;

  public Student(String name, int age, int classnum) {
    super(name, age);
    this.classnum = classnum;
  }

  public void setClassnum(int classnum) {
    this.classnum = classnum;
  }

  public int getClassnum() {
    return classnum;
  }

  @Override
  void show() {
    System.out.println("사람[이름 : "+super.getName()+", 나이 : "+super.getAge()+", 학번 : "+100+"]");
  }
}
