package chapter4_oop.MemberDemo;

public class Member {
  String name;
  String id;
  String password;
  int age;

  public Member(String name,String id){
    this.name = name;
    this.id = id;
    this.password = "1234"; //default password
  }
}
