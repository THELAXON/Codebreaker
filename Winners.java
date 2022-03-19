import javax.swing.*;


public class Winners{
    private JFrame frame = new JFrame("Code Breaker");
    private JLabel win = new JLabel("You won!");
    private static JPanel panel = new JPanel();
    public Winners(){



        panel.setBounds(0,0,200,100);
        win.setBounds(0,0,200,100);
        frame.add(panel);
        panel.add(win);
        frame.setSize(200,100);
        frame.setVisible(true);

    }
}