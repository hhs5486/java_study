package chapter6.StudentDemo;

public class ForeignStudent extends Student{
  private String From;
  public ForeignStudent(String name, int age, int classnum, String From ) {
    super(name, age, classnum);
    this.From = From;
  }
  public void setFrom(String from) {
    From = from;
  }
  public String getFrom() {
    return From;
  }

  @Override
  void show() {
    System.out.println("사람[이름 : "+super.getName()+", 학번 : "+super.getClassnum()+", 국적 : "+From+"]");
  }
}
