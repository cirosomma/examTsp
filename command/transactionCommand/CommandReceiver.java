import java.util.*;
final class CommandReceiver {
  private int[] c;
  private CommandArgument a;
  private CommandReceiver() {
    c = new int[2];
  }
  private static CommandReceiver cr = new CommandReceiver();
  public static CommandReceiver getHandle() {
    return cr;
  }
  public void setCommandArgument(CommandArgument a) {
    this.a = a;
  }
  public void methAdd() {
    c = a.getArguments();
    System.out.println("The result is "+(c[0]+c[1]));
  }
  public void methSubtract() {
    c = a.getArguments();
    System.out.println("The result is "+(c[0]-c[1]));
  }
}
