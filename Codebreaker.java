import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Codebreaker implements ActionListener
{
    private static JFrame frame = new JFrame("Code Breaker");
    private static JPanel panel = new JPanel();
    private static JLabel titles = new JLabel("Welcome to code Breaker");
    private static JButton easy = new JButton("Easy");
    private static JButton medium = new JButton("Medium");
    private static JButton hard = new JButton("Hard");
    public Codebreaker()
    {
        
        easy.setBounds(0,20,285,100);
        easy.addActionListener(this);
        easy.setFocusable(false);
        medium.setBounds(0,120,285,100);
        medium.addActionListener(this);
        medium.setFocusable(false);
        hard.setBounds(0,220,285,100);
        hard.addActionListener(this);
        hard.setFocusable(false);
        panel.add(easy);
        panel.add(medium);
        panel.add(hard);

        titles.setBounds(70,0,150,20);
        panel.add(titles);

        frame.setSize(300,350);
        frame.setContentPane(panel);
        frame.setLayout(null);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }
    @Override
    public void actionPerformed(ActionEvent e) 
    {
        if(e.getSource()== easy)
        {
            easy();
        }
        if(e.getSource()== medium)
        {
            medium();
        }
        if(e.getSource()== hard)
        {
            hard();
        }
        
        
    } 


    public static void easy()
    {
            panel.setVisible(false);
            //easy.setVisible(false);
           // medium.setVisible(false);
           // hard.setVisible(false);
           EasyLevel easylevel = new EasyLevel();
    }

    public static void medium()
    {     
    }

    public static void hard()
    {   
    }
}