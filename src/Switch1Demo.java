public class Switch1Demo {
  public static void main(String[] args) {
    Switch1Demo switch1Demo = new Switch1Demo();
    wholslt("호랑이");
  }
  static void wholslt(String bio){
    String kind = "";
    switch (bio){
      case "호랑이":
      case "사자":
        kind = "포유류";
        break;
      case "독수리":
      case "참새":
        kind = "조류";
        break;
      case "고등어":
      case "연어":
        kind = "어류";
        break;
      default:
        System.out.println("어이쿠! ");
        kind="...";
    }
    System.out.printf("%s는 %s이다+n",bio,kind);
  }
}
