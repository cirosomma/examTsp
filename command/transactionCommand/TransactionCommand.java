public class TransactionCommand implements Command {
  private CommandReceiver commandReceiver;
  private Vector commandnamelist, commandargumentlist;
  private String commandname;
  private CommandArgument commandargument;
  private Command command;
  public TransactionCommand() {
    this(null,null);
  }
  public TransactionCommand(Vector commandnamelist, Vector commandargumentlist) {
    this.commandnamelist = commandnamelist;
    this.commandargumentlist = commandargumentlist;
    commandReceiver = CommandReceiver.getHandle();
  }
  public void execute() {
    for(int i = 0;i < commandnamelist.size(); i++) {
      commandname = (String) (commandnamelist.get(i));
      commandargument = (CommandArgument) ((commandargumentlist.get(i)));
      commandReceiver.setCommandArgument(commandargument);
      String classname = commandname + "Command";
      try {
        Class cls = Class.forName(classname);
        command = (Command) cls.newInstance();
      }
      catch(Throwable e) {
        System.err.println(e);
      }
      command.execute();
    }
  }
}
