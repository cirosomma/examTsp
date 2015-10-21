public class Page {
  /**
  Il design pattern Command incapsula una richiesta come un oggetto.
  Con ciò il client ha la possibilità di effettuare diverse richieste,
  come log requests e queue.
  Promuove l'invocazione di un metodo su un oggetto ed è
  object-oriented.
  E' utilizzato principalmente quando bisogna fare
  richieste ad oggetti senza sapere nulla dell'operazione richiesta
  o del receiver della richiesta.
  Tale pattern disaccoppia l'oggetto che invoca l'operazione
  dall'oggetto che conosce come eseguirla. Per ottenere questa
  separazione il designer crea una classe astratta che mappa un receiver
  (un oggetto) con un'azione (un puntatore a una funzione membro).
  La classe base contiene un metodo execute() che semplicemente
  chiama l'azione sul receiver.
  Tutti i client dell'oggetto Command trattano ogni oggetto come una
  "black box", eseguendo semplicemente un'inovazione sul metodo
  execute sull'ogggetto ogni volta che il client richiede il "servizio"
  dell'oggetto.
  La classe command gestisce il seguente insieme:
    - un oggetto
    - un metodo che può essere applicato all'oggetto
    - gli argomenti necessari quando bisogna chiamare il metodo
  Il metodo "execute" del command poi fa lavorare insieme questi pezzi

  ( + ) I design non solo accelerano la fase di design di un progetto
  object-oriented ma incrementano la produttività del team di sviluppo e la
  qualità del software.
  Un Command pattern è un design pattern comportamentale che ci abilita a
  ottenere un completo disaccoppiamento tra il sender e il receiver.
  Un sender è un oggetto che invoca una operazione e un receiver è un oggetto
  che riceve la richiesta a eseguire una certa operazione.
  Con il disaccoppiamento il sender non ha conoscenza dell'interfaccia del
  Receiver, il termine request riferisce al command che è eseguito. Tale pattern
  ci consente di cambiare quando e come la richiesta è compiuta, otteniamo
  flessibilità e estendibilità.
  */
  public static void main(String... args) {
    Light testLight = new Light();
    LightOnCommand testLOC = new LightOnCommand(testLight);
    LightOffCommand testLFC = new LightOffCommand(testLight);
    Switch testSwitch = new Switch(testLOC, testLFC);
    testSwitch.flipUp();
    testSwitch.flipDown();
  }
}
