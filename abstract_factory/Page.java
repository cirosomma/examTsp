/* Abstract Factory Pattern
  L'abstract factory si base su un super-factory che crea altri factory.
  Questo design pattern fa parte del gruppo dei pattern creazionali, e fornisce
  uno dei migliori modi a creare oggetti senza fornire la loro classe concreta
  ma fornendo un'interfaccia comune.

  Client ----------------------------------> Abstract Factory
    |                                        + Create Product A
    |__________________                      + Create Product B
    |                 |                        |_|    |_|
    |         Abstract Product A                |      |
    |         |            |                   |      |
    |  Product A1   Product A2    Concrete F1   Concrete F2
    |     |__________________________________|    |
    |                                             |
    |__________________________                   |
                              |                   |
                        Abstract Product B        |
              ____________________________________|
             |
          Product B1                     Product B2
*/


public class Page {
  public static void main (String... args) {
    AbstractFactory ex = FactoryProducer.getFactory("SHAPE");
    ex.getShape("Circle").draw();
  }
}
