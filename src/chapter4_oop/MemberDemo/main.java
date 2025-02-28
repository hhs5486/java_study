package chapter4_oop.MemberDemo;

public class main {
  public static void main(String[] args) {
    Member member = new Member("홍길동","hong");
    MemberService memberService = new MemberService(member);
    if (memberService.login("hong","1234")){
      System.out.println("로그인 되었습니다.");
      memberService.loginout("hong");
    }else {
      System.out.println("id 또는 password가 올바르지 않습니다.");
    }
  }
}
