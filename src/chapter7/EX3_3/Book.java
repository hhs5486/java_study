package chapter7.EX3_3;

import java.util.Arrays;

public class Book implements Comparable{
  private int price;
  Book(int price){
    this.price = price;
  }

  public Book[] price(Book[] books) {
    Arrays.sort(books);
    return books;
  }

  @Override
  public int compareTo(Object object) {
    return 0;
  }

  @Override
  public String to_String() {
    return "";
  }
}
