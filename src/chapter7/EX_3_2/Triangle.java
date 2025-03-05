package chapter7.EX_3_2;

public class Triangle implements Comparable{
  int height=0,width=0;
  Triangle(int height, int width){
    this.height = height;
    this.width = width;
  }
  @Override
  public void Triangle_extent(Object T) {
    if (T instanceof Triangle T2) {
      if (this.getArea() > T2.getArea()) {
        System.out.println("T1이 더 큼");
      }else if (this.getArea() < T2.getArea()) {
        System.out.println("T2이 더 큼");
      }else {
        System.out.println("같은 넓이");
      }
    }
  }

  private double getArea(){
    return (height*width)/(double)2;
  }
}
