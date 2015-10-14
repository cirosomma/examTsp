public class Page {
  /**
  Il design pattern iterator è ampiamente utilizzato in Java e .Net,
  permette di navigare una collezione di elementi
  in maniera sequenziale senza la necessità di
  sapere la struttura interna. E' un pattern di tipo
  comportamentale.
  */
  public static void main(String... args) {
    NameRepository namesRepository = new NameRepository();
    for(Iterator iter = namesRepository.getIterator(); iter.hasNext();) {
      String name = (String)iter.next();
      System.out.println("Name : " + name);
    }
  }
}
