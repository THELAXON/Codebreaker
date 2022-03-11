import javax.swing.*;
import java.awt.event.ActionEvent;
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
        
        button.setBounds(0,0,100,100);
        button.addActionListener(this);
        button.setFocusable(false);
        button1.setBounds(100,0,100,100);
        button1.addActionListener(this);
        button1.setFocusable(false);
        button2.setBounds(200,0,100,100);
        button2.addActionListener(this);
        button2.setFocusable(false);
        panel.add(button);
        panel.add(button1);
        panel.add(button2);

        frame.setSize(300, 100);
        frame.setContentPane(panel);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()== button){
            System.out.println("hello");
        }
        if(e.getSource()== button1){
            System.out.println("it's");
        }
        if(e.getSource()== button2){
            System.out.println("me");
        }
        
        
    } 
}