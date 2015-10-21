public class AddCommand extends TransactionCommand {
  private CommandReceiver cr;
  public AddCommand() {
    cr = CommandReceiver.getHandle();
  }
  public void execute() {
    cr.methAdd();
  }
}
