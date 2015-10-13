public class Page {
  /**
  Nel factory pattern noi creiamo un oggetto senza
  esporre la logica creazionale al client ma fornendo
  una comune interfaccia.
  E' un pattern di tipo creazionale.
  */
  public static void main(String... args) {
    ShapeFactory shapeFactory = new ShapeFactory();

    //get an object of Circle and call its draw method.
    Shape shape1 = shapeFactory.getShape("CIRCLE");

    //call draw method of Circle
    shape1.draw();

    //get an object of Rectangle and call its draw method.
    Shape shape2 = shapeFactory.getShape("RECTANGLE");

    //call draw method of Rectangle
    shape2.draw();

    //get an object of Square and call its draw method.
    Shape shape3 = shapeFactory.getShape("SQUARE");

    //call draw method of Circle
    shape3.draw();
  }
}
