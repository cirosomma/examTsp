public class Page {
  /**
  Il pattern mediator è usato a ridurre la complessità di comunicazione tra
  oggetti multipli o classi. Fornisce una classe mediator che normalmente
  gestisce tutte le comunicazioni tra differenti classi e supporta
  facilmente il mantenimento del codice con un basso accoppiamento.

  */
  public static void main(String... args) {
    ChatMediator mediator = new ChatMediatorImpl();
    User user1 = new UserImpl(mediator, "Uno");
    User user2 = new UserImpl(mediator, "Due ");
    User user3 = new UserImpl(mediator, "Tre ");
    User user4 = new UserImpl(mediator, "Quattro");
    mediator.addUser(user1);
    mediator.addUser(user2);
    mediator.addUser(user3);
    mediator.addUser(user4);

    user1.send("Hi all");

  }
}
