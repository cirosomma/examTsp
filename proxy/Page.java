/*
    Fornisce un surrogato di un altro oggetto per controllare l'accesso a tale
    oggetto. In pratica creiamo un oggetto avente la stessa interfaccia
    dell'oggetto che si vuole controllare.
    Obiettivi:
    - Controllare accessi per differenti client
    - Non tutti i client dovrebbero essere autorizzati a usare i servizi di un
      componente
    - Utilizzabile in ogni ambiente distribuito per rappresentare oggetti remoti
      in locale
    Questo pattern permette ai client di comunicare con una rappresentazione del
    compontente che si vorrebbe realmente utilizzare.
    Introduce un sostituto che dovrebbe fornire maggiore efficienza.
    Facilita l'accesso e protegge da accessi non autorizzati
    Applicabilità:
    - Proxy Remoto: Fornisce un rappresentante locale per un oggetto presente
      in uno spazio di indirizzamento locale
    - Proxy Virtuale: Gestisce la creazione su richiesta di oggetti costosi
                      Tali oggetti vengono istanziati solo quando servono
    - Proxy di Protezione: Controlla l'accesso ad un oggetto

    Implementazione:
    Usa un oggetto rappresentativo (chiamato Proxy) tra il client e il
    componente. Offre la stessa interfaccia del componente che vogliamo
    "fornire" ma esegue delle azioni addizionali come pre e post-processing come
    access-control, caching, logging, ect..
                           __________________________
                          |         Client          |
                          |      + request()        |
                          |_________________________|
                                      |
                         ____________\|/_____________
                        |           Proxy           |
          _Real_Object__|       + request() {       |
         |              |    realObject.request()}  |
         |              |___________________________|
         |
________\/_________
|   Real Object   |
| + request ()    |
|_________________|

*/

public class Page {
  public static void main(String[] args) {
    Image image = new ProxyImage("test10_tmb.jpg");

    // image will be loaded from disk
    image.display();
    System.out.println(" ");

    // image will not be loaded from disk
    image.display();
  }
}
