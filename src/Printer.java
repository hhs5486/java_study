public class Printer {
  public static void main(String[] args) {
    Printer printer = new Printer();
    printer.printIn(10);
    printer.printIn(true);
    printer.printIn(5.7);
    printer.printIn("홍길동");
  }
  void printIn(int value){
    printIn(value);
  }
  void printIn(boolean value){
    printIn(value);
  }
  void printIn(double value){
    printIn(value);
  }
  void printIn(String value){
    printIn(value);
  }

}
