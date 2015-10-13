public class Page {
  /**
  Il design pattern Singleton è uno dei più semplici
  design pattern in Java. E' un pattern di tipo
  creazionale, fornisce un modo unico per la creazione
  di un oggetto.
  Tale pattern coinvolge una sola classe che è
  responsabile per la creazione di un oggetto e del
  controllo che solo un singolo oggetto venga instanziato.
  In pratica fornisce un metodo diretto dal quale è possibile
  utilizzare tale oggetto, senza instanziarlo.
  */
  public static void main(String... args) {
    //illegal construct
    //Compile time error: The constructor
    //SingleObject() is not visible
    //SingleObject object = new SingleObject()

    //Get the only object available
    SingleObject object = SingleObject.getInstance();

    //Show the message
    object.showMessage();
  }
}
