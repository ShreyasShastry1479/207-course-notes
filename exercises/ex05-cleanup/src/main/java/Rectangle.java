/**
 * Represents a rectangle with a width and height.
 */
public class Rectangle {

  private double width;
  private double height;

  /**
   * Creates a rectangle with the given width and height.
   *
   * @param w the width
   * @param h the height
   */
  public Rectangle(double w, double h) {
    this.width = w;
    this.height = h;
  }

  /**
   * Returns the area of this rectangle.
   *
   * @return width * height
   */
  public double area() {
    return width * height;
  }

  /**
   * Scales the rectangle by the given factor.
   *
   * @param factor the factor to scale by
   */
  public void scale(double factor) {
    width = width * factor;
    height = height * factor;
  }

  /**
   * Returns whether this rectangle has a larger area than the other.
   *
   * @param other the other rectangle to compare with
   * @return true if this rectangle's area is greater than other's area
   */
  public boolean isLargerThan(Rectangle other) {
    return area() > other.area();
  }
}
