public abstract class Shape {
  // Composition - implementator
  protected Color color;

  //constructor with implementator as input argument
  public Shape(Color c) {
    this.color = c;
  }

  abstract public void applyColor();
}
