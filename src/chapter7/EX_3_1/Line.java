package chapter7.EX_3_1;

public class Line implements Comparable {
  int length = 0;
  Line(int length){
    this.length = length;
  }


  @Override
  public void LineComper(Line line, Line line2) {
    Comparable.super.LineComper(line,line2);
  }
}
