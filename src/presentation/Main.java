package presentation;

public class Main {
  public static void main(String[] args) {

  }
}

class makeHous{

}

class constructionMaterials{
  Cement cement;
  Rebar rebar;
  GypsumGoard gypsumGoard;
  Food food;
  constructionMaterialsPocket pocket = new constructionMaterialsPocket();
  void inpocket(){
    pocket.cement = cement;
  }

  Doraemon doraemon = new Doraemon();

  void  inDoraemonPocket(){
    doraemon.pocket.setInpocket(cement);
    doraemon.pocket.setInpocket(rebar);

  }

}
class constructionMaterialsPocket{
  public Cement cement;
}

class Pocket2{
  public Object rebar;
  public Object gypsum_board;
}

class Doraemon{
  DoraemonPocket<Object> pocket;
}

class DoraemonPocket<T>{
  private  T inpocket;
  public  T getInpocket(){
    return inpocket;
  }
  public void setInpocket(T inpocket){
    this.inpocket = inpocket;
  }
}

class Cement{
}

class Rebar{
}

class GypsumGoard{
}

class Food{

}

