public class BinaryObserver implements Observer {
  public BinaryObserver(Subject subject) {
    this.subject = subject;
    this.subject.attach(this);
  }

  @Override
  public void update() {
    System.out.println("Binary String: "+ Integer.toBinaryString(subject.getState()));
  }

  public void exit() {
    this.subject.deattach(this);
    this.subject = null;
  }

  private Subject subject;
}
