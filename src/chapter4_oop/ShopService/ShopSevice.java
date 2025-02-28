package chapter4_oop.ShopService;

public class ShopSevice {
  private  static  ShopSevice shopSevice = new ShopSevice();

  private ShopSevice(){

  }
  public static ShopSevice getInstance(){
    return shopSevice;
  }
}
