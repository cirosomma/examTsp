public class SubtractCommand extends TransactionCommand {
  private CommandReceiver cr;
  public SubtractCommand() {
    cr = CommandReceiver.getHandle();
  }
  public void execute() {
    cr.methSubtract();
  }
}
