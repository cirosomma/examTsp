public class FanOnCommand implements Command {
  private Fan myFan;
  public FanOnCommand(Fan f) {
    myFan = f;
  }
  public void execute() {
    myFan.startRotate();
  }
}
