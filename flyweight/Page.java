public class Page {
  /**
  Il design pattern Flyweight è ampiamente usato a ridurre
  il numero di oggetti creati con incremento delle performance
  poichè c'è una diminuzione della memoria.
  E' un pattern di tipo strutturale.
  Il funzionamento del pattern è semplice, proviamo a
  utilizzare già elementi instanziati salvati in precedenza,
  quando non li troviamo, li creiamo e li salviamo.
  */
  private static final String colors[] = {"Red", "Green", "White", "Blue", "Black"};

  public static void main(String... args) {
    for(int i=0; i<20;++i) {
      Circle circle = (Circle) ShapeFactory.getCircle(getRandomColor());
      circle.setX(getRandomX());
      circle.setY(getRandomY());
      circle.setRadius(100);
      circle.draw();
    }
  }
  private static String getRandomColor() {
    return colors[(int)(Math.random()*colors.length)];
  }
  private static int getRandomX() {
    return (int)(Math.random()*100);
  }
  private static int getRandomY() {
    return (int)(Math.random()*100);
  }
}
