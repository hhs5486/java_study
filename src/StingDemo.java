public class StingDemo {
  public static void main(String[] args){
    Cat c1= new Cat("나비");
    Cat c2 = new Cat("야옹이");

    System.out.println(c2.Getname());

  }
}
class  Cat{
  private final String name;

  public Cat(String name){
    this.name = name;
  }
//  public void setCat(String name){
//    this.name = name;
//  }
  public String Getname(){
    return this.name;
  }
}
