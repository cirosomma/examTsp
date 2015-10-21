public class LightOffCommand implements Command {
  private Light myLight;
  public LightOffCommand(Light l) {
    myLight = l;
  }
  public void execute() {
    myLight.turnOff();
  }
}
