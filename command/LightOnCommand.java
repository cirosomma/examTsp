public class LightOnCommand implements Command {
  private Light myLight;
  public LightOnCommand (Light light) {
    myLight = light;
  }
  public void execute() {
    myLight.turnOn();
  }
}
