package chapter8.EX1_1;

import java.util.Objects;

public class Circle {
  private int radius = 0;

  Circle(int radius){
    this.radius = radius;
  }

  @Override
  public boolean equals(Object obj) {
    return this.hashCode() == ((Circle)obj).hashCode();
  }

  @Override
  public int hashCode() {
    return Objects.hashCode(radius);
  }
}
