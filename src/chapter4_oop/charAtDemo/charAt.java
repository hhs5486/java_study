package chapter4_oop.charAtDemo;

public class charAt {
  static int countChar(String s, char c) {
    int count = 0;
    for (int i = 0; i < s.length(); i++) {
      s.charAt(i);
      if (s.charAt(i) == c || s.charAt(i)-32 == c) {
        count++;
      }
    }
    return count;
  }
}
