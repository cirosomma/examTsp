/**
  L'observer pattern è utilizzato quando c'è una
  relazione 1-N tra oggetti, comunemente chiamato
  anche Publisher-Subscriber, aiuta a mantenere
  sincronizzato gli oggetti che cooperano tra di
  loro. Per ottenere questo risultato un Publisher
  abilita una propagazione one-way dei cambiamenti,
  cioè, un publisher notifica a tutti i subscriber
  il cambiamento del proprio stato.

  Problema:
  I dati sono centralizzati ma molte(remote) componenti
  dipendono su questi dati.
  Uno o più componenti devono essere notificati
  del cambiamento di un particolare componente.
  Il numero e gli ID delle componenti sono noti solo
  a runtime. Far effettuare il polling dai dipendenti
  per scaricare nuove informazioni non è fattibile.
  Componenti non dovrebbero essere strettamente
  accoppiate quando introduciamo un nuovo meccanismo
  di propagazione.
  Soluzione:
  Publisher è il ruolo principale, tutte le componenti
  dipendono sui cambiamenti nel publisher al quale
  sono sottoiscritti. Esso mantiene un registro
  con tutte le componenti
  I subscriber comunicano con il pubblisher attraverso
  la sua interfaccia. Ogni qualvolta lo stato del
  publisher cambia, viene inviata una notifica a tutti
  i suoi subscriber. I subscriber quando ricevono la
  notifica possono cambiare i dati a loro discrezione.
  Conseguenze:
  Vantaggi: Mutabilità, Estendibilità, Supporto a sistemi
  distribuiti.
  Svantaggi: Efficienza, Complessità
*/

public class Page {
  public static void main(String[] args) {
    ConcreteSubject subject = new ConcreteSubject();

    new HexaObserver(subject);
    new OctalObserver(subject);
    new BinaryObserver(subject);

    System.out.println("First state change: 15");
    subject.setState(15);
    System.out.println("Second state change: 10");
    subject.setState(10);
  }
}
