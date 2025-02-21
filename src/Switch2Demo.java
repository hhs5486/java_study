public class Switch2Demo {
  public static void main(String[] args) {
    String day = "화";
    String result = switch (day){
      case "월","화","수","목","금" -> "평일";
      case  "토","일"->"주말";
      default -> "구분할 수 없음";
    };
    System.out.println(day+":"+result);
  }
}
