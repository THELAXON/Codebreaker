import javax.swing.*;


public class Winners{
    private JFrame frame = new JFrame("Code Breaker");
    private JLabel win = new JLabel("You won!");
    private static JPanel panel = new JPanel();
    public Winners(){



        panel.setBounds(0,0,100,200);
        win.setBounds(0,0,75,150);
        frame.add(panel);
        panel.add(win);
        frame.setSize(100,200);
        frame.setVisible(true);

    }
}