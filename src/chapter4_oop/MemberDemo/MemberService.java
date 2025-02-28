package chapter4_oop.MemberDemo;

public class MemberService {
  MemberService(Member member){
    this.member = member;
  }

  Member member = null;
  boolean login(String id,String password){
    if (member.id.equals(id) && member.password.equals(password)){
      return true;
    }
    return false;
  }
  void loginout(String id){
    if (member.id.equals(id)){
      System.out.println(id+"님이 로그인 아웃 되었습니다.");
    }
  }
}
