public class Page {
  /**
  Il design pattern adapter permette di convertire
  l'interfaccia di una classe in un'altra interfaccia
  richiesta dal client. Consente quindi di far cooperare
  classi con interfacce incompatibili.
  Tale pattern lavora come un ponte tra due interfacce
  incompatibili, è di tipo strutturale.
  Per l'implementazione abbiamo bisogno di una singola
  classe che è responsabile di unire le funzionalità
  le funzionalità di interfacce incompatibili o
  indipentendi.
  http://stackoverflow.com/questions/3478225/when-do-we-need-adapter-pattern
  */
  public static void main(String... args) {
    AudioPlayer audioPlayer = new AudioPlayer();

    audioPlayer.play("mp3", "asd.mp3");
    audioPlayer.play("mp4", "asd.mp4");
    audioPlayer.play("vlc", "asd.vlc");
    audioPlayer.play("avi", "asd.avi");
  }
}
