package chapter7.EX3_3;

import java.util.Arrays;

public class Test {
  void test(){
    Book[] books = new Book[]{
        new Book(1002),new Book(1001), new Book(1000)
    };
    System.out.println(Arrays.toString(books[1].price(books)));
  }
}
