public class StringDemo3 {
  public static void main(String[] args) {
    String s1 = new String("h1");
    String s2 = new String(" java");

    System.out.println(s2.charAt(4));
    System.out.println(s2.charAt(s2.length()-1));
    for (int i = 1; i < s2.length(); i++) {
      System.out.println(s2.charAt(i));
    }
    System.out.println(s1);
    s1 = s1.toUpperCase();
    System.out.println(s1);

    String str = ""+3.14;
    String str1 = String.valueOf(3.14);
    String fruits = String.join(" ","apple","banana","cherry","durian");
    System.out.println("fruits:"+fruits);
  }
}
