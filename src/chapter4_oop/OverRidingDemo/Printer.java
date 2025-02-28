package chapter4_oop.OverRidingDemo;

public class Printer {
 public static void printer(int a){
   System.out.println(a);
 }
  public static void printer(boolean a){
    System.out.println(a);
 }
  static void printer(double a){
    System.out.println(a);
 }
  static void printer(String a){
    System.out.println(a);
 }
}
