public class FanOffCommand implements Command {
  private Fan myFan;
  public FanOffCommand(Fan f) {
    myFan = f;
  }
  public void execute() {
    myFan.stopRotate();
  }
}
