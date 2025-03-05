package chapter8.EX3;

import java.util.Calendar;

public class Main {
  static String[] weekName = {"일","월","화","수","목","금","토"};
  static String[] noonName = {"오전","오후"};
  static Calendar c = Calendar.getInstance();

  static int year = c.get(Calendar.YEAR);
  static int month = c.get(Calendar.MONTH)+1;
  static int day = c.get(Calendar.DAY_OF_MONTH);

  static String Week = weekName[c.get(Calendar.WEEK_OF_MONTH)];
  static String noon = noonName[c.get(Calendar.AM_PM)];

  static  int hour = c.get(Calendar.HOUR);
  static  int minute = c.get(Calendar.MINUTE);
  static  int second = c.get(Calendar.SECOND);

  public static void main(String[] args) {
    System.out.println(year+"년"+month+"월"+day+"일");
    System.out.println(Week+"요일 "+noon);
    System.out.println(hour+"시"+minute+"분"+second+"초");


  }
}
