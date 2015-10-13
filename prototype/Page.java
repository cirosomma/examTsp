public class Page {
  /**
  Il design pattern prototype permette di creare dei
  duplicati degli oggetti che ci interessano evitando
  di ricrearli e pertanto migliorare le performance.
  E' un pattern creazionale.
  L'implementazione del pattern consiste nell'implementare
  un'interfaccia prototype che ha un metodo clone che
  permette la clonazione del oggetto che ci interessa.
  Ovviamente l'utilizzo di questo design pattern è utilizzato
  quando la creazione di un oggetto è costosa perchè
  dipendete da una precedente esecuzione di una costosa
  interogazione al db.
  Possiamo utilizzare la cache dell'oggetto, resituendo
  il suo clone sulle successive richieste e aggiornare
  il database solo quando necessario, quindi riducendo
  le chiamate al db.
  */
  public static void main(String... args) {
    ShapeCache.loadCache();

    Shape clonedShape = (Shape) ShapeCache.getShape("1");
    System.out.println("Shape : "+clonedShape.getType());
    
    Shape clonedShape2 = (Shape) ShapeCache.getShape("2");
    System.out.println("Shape : "+clonedShape2.getType());

    Shape clonedShape3 = (Shape) ShapeCache.getShape("3");
    System.out.println("Shape : "+clonedShape3.getType());
  }
}
