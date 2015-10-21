import javax.swing.*;

public class Page extends JWindow {
    public static void main(String... args) {
      Page p = new Page();
      p.setSize(500,500);
      p.setVisible(true);
      p.add(new JLabel("lol"));
    }
}
