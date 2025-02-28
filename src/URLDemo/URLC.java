package URLDemo;

public class URLC {
  URLC(String URL){
    if ((URL.substring(URL.length()-3,URL.length())).equals("com")){
      System.out.println(URL+" 은 'com'으로 끝납니다.");
    }
      if (URL.contains("java")){
        System.out.println(URL+"은 'java'를 포함합니다.");

        }

  }
}

