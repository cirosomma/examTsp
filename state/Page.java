public class Page {
  /**
  Nello state pattern una classe cambia comportamento in base al suo stato.
  E' un pattern di tipo comportamentale, noi creiamo oggetti che rappresentano
  vari stati e un context object cambia il suo comportamento in base al suo
  stato.
  Tale pattern decide quando eseguire delle azioni in base al suo stato,
  il context non è a conoscenza degli stati che sono disponibili, questo
  significa che le classi aderiscono all'open-closed design principle (OCP).
  La classe è chiusa per aggiungere nuovi tipi, ma è aperta per estenderli
  */
  public static void main(String... args) {
    Context context = new Context();

      StartState startState = new StartState();
      startState.doAction(context);

      System.out.println(context.getState().toString());

      StopState stopState = new StopState();
      stopState.doAction(context);

      System.out.println(context.getState().toString());
  }
}
