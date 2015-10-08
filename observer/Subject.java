public interface Subject {
  public void attach(Observer observer);
  public void deattach(Observer observer);
  public int getState();
}
