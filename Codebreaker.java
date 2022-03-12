import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Codebreaker implements ActionListener
{
    private JFrame frame = new JFrame("Code Breaker");
    private JPanel panel = new JPanel();
    private static JButton button = new JButton("Easy");
    private static JButton button1 = new JButton("Medium");
    private static JButton button2 = new JButton("Hard");
    public Codebreaker()
    {
        
        button.setBounds(0,0,300,100);
        button.addActionListener(this);
        button.setFocusable(false);
        button1.setBounds(0,100,300,100);
        button1.addActionListener(this);
        button1.setFocusable(false);
        button2.setBounds(0,200,300,100);
        button2.addActionListener(this);
        button2.setFocusable(false);
        panel.add(button);
        panel.add(button1);
        panel.add(button2);

        frame.setSize(300, 330);
        frame.setContentPane(panel);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }
    @Override
    public void actionPerformed(ActionEvent e) 
    {
        if(e.getSource()== button)
        {
            easy();
        }
        if(e.getSource()== button1)
        {
            medium();
        }
        if(e.getSource()== button2)
        {
            hard();
        }
        
        
    } 


    public static void easy()
    {
           // button.setVisible(false);
            button1.setVisible(false);
            button2.setVisible(false);
            JLabel label = new JLabel();
            label.setText("welcome to easy level");
            label.setVisible(true);
            
    }

    public static void medium()
    {
            button.setVisible(false);
            button1.setVisible(false);
            button2.setVisible(false);

            
    }

    public static void hard()
    {
            button.setVisible(false);
            button1.setVisible(false);
            button2.setVisible(false);

            
    }
}