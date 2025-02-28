package chapter4_oop.ShopService;

public class main {
  public static void main(String[] args) {
    ShopSevice shopSevice = ShopSevice.getInstance();
    ShopSevice shopSevice1 = ShopSevice.getInstance();

    if (shopSevice1 == shopSevice) {
      System.out.println("같은 ShopService 객체입니다.");
    }else {
    System.out.println("다른 ShopService 객체입니다.");
    }

  }
}
