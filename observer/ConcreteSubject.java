import java.util.ArrayList;
import java.util.List;

public class ConcreteSubject implements Subject {
  private List<Observer> observers = new ArrayList<Observer>();
  private int state;

  public int getState() {
    return state;
  }
  public void setState(int state) {
    this.state = state;
    notifyAllObservers();
  }

  public void attach(Observer observer) {
    observers.add(observer);
  }
  public void deattach(Observer observer) {
    int i=0;
    for(Observer tmp : observers) {
      if(tmp.equals(observer)) {
        observers.remove(i);
        break;
      }
    }
  }
  public void notifyAllObservers() {
    for(Observer observer : observers) {
      observer.update();
    }
  }
}
