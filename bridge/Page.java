public class Page {
  /**
  Il design pattern Bridge è usato quando abbiamo la
  necessità di disaccoppiare un'astrazione dalla sua
  implementazione, così che le due possono cambiare
  indipendentemente. E' un design di tipo strutturale.
  Il funzionamento è semplice, si fornisce una struttura
  bridge per farli comunicare.

  */
  public static void main(String... args) {
    Shape tri = new Triangle(new RedColor());
    tri.applyColor();
    Shape pent = new Pentagon(new GreenColor());
    pent.applyColor();
  }
}
