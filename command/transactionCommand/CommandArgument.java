public class CommandArgument {
  private int[] args;
  CommandArgument() {
    args = new int[2];
  }
  public int[] getArguments() {
    return args;
  }
  public void setArgument(int i1, int i2) {
    args[0] = i1;
    args[1] = i2;
  }
}
