public class Page {
  /**
  Il design pattern Facade nasconde la complessità del
  sistema e fornisce un interfaccia più semplice al
  client per accedervi.
  E' un design pattern di tipo strutturale e aggiunge
  un'interfaccia al sistema esistente nascondendo la
  sua complessità.
  Per l'implementazione di tale pattern abbiamo la
  necessità di utilizzare una singola classe che
  fornisce metodi semplificati per il client e
  pertanto le chiamate alle classi del sistema
  esistente vengono delegate a queste metodi
  semplificati.
  */
  public static void main(String... args) {
    ShapeMaker shapeMaker = new ShapeMaker();

    shapeMaker.drawCircle();
    shapeMaker.drawRectangle();
    shapeMaker.drawSquare();
  }
}
