package chapter6.PointDemo;

public class MovablePoint extends Point{
  private int xSpeed,ySpeed;

  public MovablePoint(int x, int y,int xSpeed, int ySpeed) {
    super(x, y);
    this.xSpeed = xSpeed;
    this.ySpeed = ySpeed;
  }

  public int getxSpeed() {
    return xSpeed;
  }

  public int getySpeed() {
    return ySpeed;
  }

  public void setxSpeed(int xSpeed) {
    this.xSpeed = xSpeed;
  }

  public void setySpeed(int ySpeed) {
    this.ySpeed = ySpeed;
  }

  @Override
  public String toString() {
    return super.toString()+" xSpeed:"+xSpeed+" ySpped:"+ySpeed;
  }
}
