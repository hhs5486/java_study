package presentation;

public class Main {
  public static void main(String[] args) {
    DoraemonPocket<새참> pocket = new DoraemonPocket<>();
    잔치국수 잔치국수 = new 잔치국수();
    옥수수 옥수수 = new 옥수수();
    pocket.setInpocket(잔치국수);
    pocket.setInpocket(옥수수);
    System.out.println(pocket.getInpocket()[0]);


  }
}

class 세참{
  새참 새참;
  잔치국수 잔치국수;
  옥수수 옥수수;
}

class DoraemonPocket<T> extends infinity{
  private infinity<T> inpocket = new infinity<>();



  public T[] getInpocket(){
    return inpocket.get();
  }

  public void setInpocket(T inpocket){
    this.inpocket.add(inpocket);
  }



}
class infinity<T>{

  private T[] infinity;
  private int infinitylength = 0;

  void add(T inpocket) {
    infinity[infinitylength] = inpocket;
    infinitylength++;
  }

  T[] get(){
    return infinity;
  }
}

class 새참{
}
class 잔치국수 extends 새참{
}
class 옥수수 extends 새참{
}


