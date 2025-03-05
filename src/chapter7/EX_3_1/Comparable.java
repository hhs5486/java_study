package chapter7.EX_3_1;

public interface Comparable {
  int length = 0;

  default void LineComper(Line line, Line line2){
    if (line.length<line2.length){
      System.out.println("Line1:"+line.length+"<Line2:"+line2.length);
    }
    if (line.length>line2.length){
      System.out.println("Line1:"+line.length+">Line2:"+line2.length);
    }
  }

}
