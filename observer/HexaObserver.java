public class HexaObserver implements Observer {
  public HexaObserver(Subject subject) {
    this.subject = subject;
    this.subject.attach(this);
  }

  @Override
  public void update() {
    System.out.println("Hex String: "+ Integer.toHexString(subject.getState()));
  }

  public void exit() {
    this.subject.deattach(this);
    this.subject = null;
  }

  private Subject subject;
}
