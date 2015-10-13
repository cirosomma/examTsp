public class Page {
  /**
  Nel design pattern Strategy, il comportamento di una classe o i suoi
  algoritmi possono cambiare a runtime. Questo pattern è di tipo
  comportamentale.
  Creiamo oggetti che rappresentano le varie strategie e un context object che
  cambia le strategie in base al suo comportamento.
  Lo scopo è quello di definire una famiglia di algoritmi, incapsularli e
  renderli intercambiabili. Permette agli algoritmi di variare
  indipendentemente dai client. Lo utilizziamo quando molte classi correlate
  differiscono solo per il comportamento. Permette di configurare una classe
  con un comportamento scelto tra tanti.
  E' anche utilizzato quando sono necessarie diverse varianti di un algoritmo
  ed evitare così di esporre strutture dati complessi e specifiche
  dell'algoritmo.
  Un altro caso di utilizzo è quando in una classe sono presenti molti
  comportamenti che compaiono all'interno di scelte condizionali multiple
  (sostituisce le scelte condizionali multiple).


  */
  public static void main(String... args) {
    Context context = new Context(new OperationAdd());
    System.out.println("10 + 5 = " + context.executeStrategy(10,5));

    context = new Context(new OperationSubstract());
    System.out.println("10 - 5 = " + context.executeStrategy(10,5));

    context = new Context(new OperationMultiply());
    System.out.println("10 * 5 = " + context.executeStrategy(10,5));
  }
}
