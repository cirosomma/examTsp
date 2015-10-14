public class Page {
  /**
  Nel design pattern Visitor, noi usiamo una classe visitor
  che cambia gli algoritmi di esecuzione di ogni elemento.
  In questo modo gli algoritmi di esecuzione possono variare
  come e quando il visitor varia. E' un design pattern di tipo
  comportamentale. Per funzionare l'oggetto deve accettare il
  visitor object così che possa gestire le operazioni le
  operazioni sull'elemento.
  */
  public static void main(String... args) {
    ComputerPart computer = new Computer();
    computer.accept(new ComputerPartDisplayVisitor());
  }
}
