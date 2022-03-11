import javax.swing.*;
import java.awt.event.ActionListener;

public class Codebreaker implements ActionListener
{
    private JFrame frame = new JFrame("Code Breaker");
    private JPanel panel = new JPanel();
    private JButton button = new JButton("Easy");
    private JButton button1 = new JButton("Medium");
    private JButton button2 = new JButton("Hard");
    public Codebreaker()
    {
        
        button.setBounds(0,0,100,100)
        frame.setSize(600, 600);
        frame.setLayout(new GridLayout(3,1));
        frame.setContentPane(panel);
        panel.add(button);
        panel.add(button1);
        panel.add(button2);

        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);


        public void actionPerformed(ActionEvent e)
        {
            if(e.getSource()== button) 
            {
                system.out.println("pain");
            }
        }
    } 
}