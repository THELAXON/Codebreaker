import javax.swing.*;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//import java.util.Random;


public class EasyLevel implements ActionListener
{
    private JFrame frame = new JFrame("Code Breaker Game");
    private JPanel panel = new JPanel();
    private static JLabel empty = new JLabel();
    private static JLabel score_0 = new JLabel();
    private static JLabel score_1 = new JLabel();
    private static JButton red = new JButton();
    private static JButton orange = new JButton();
    private static JButton yellow = new JButton();
    private static JButton green = new JButton();
    private static JButton blue = new JButton();
    private static JButton indigo = new JButton();
    private static JButton violet = new JButton();
    public EasyLevel()
    {
        ImageIcon redicon = new ImageIcon("Colour_0.png");
        ImageIcon orangeicon = new ImageIcon("Colour_1.png");
        ImageIcon yellowicon = new ImageIcon("Colour_2.png");
        ImageIcon greenicon = new ImageIcon("Colour_3.png");
        ImageIcon blueicon = new ImageIcon("Colour_4.png");
        ImageIcon indigoicon = new ImageIcon("Colour_5.png");
        ImageIcon violeticon = new ImageIcon("Colour_6.png");
        ImageIcon emptyicon = new ImageIcon("Empty.png");
        ImageIcon score_0icon = new ImageIcon("Colour_6.png");
        ImageIcon score_1icon = new ImageIcon("Colour_6.png");


        red.setBounds(0,510,50,50); 
        orange.setBounds(50,510,50,50);
        yellow.setBounds(100,510,50,50);
        green.setBounds(150,510,50,50);
        blue.setBounds(200,510,50,50);
        indigo.setBounds(250,510,50,50);
        violet.setBounds(300,510,50,50); 
        frame.setSize(365, 600);
        frame.setResizable(false);
        frame.setContentPane(panel);
        frame.setLayout(null);
        frame.getContentPane().setBackground(new Color(0x996600)); 
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        red.setIcon(redicon);
        orange.setIcon(orangeicon);
        yellow.setIcon(yellowicon);
        green.setIcon(greenicon);
        blue.setIcon(blueicon);
        indigo.setIcon(indigoicon);
        violet.setIcon(violeticon);
        empty.setIcon(emptyicon);
        score_0.setIcon(score_0icon);
        score_1.setIcon(score_1icon);
        frame.setVisible(true);
        panel.add(red);
        panel.add(orange);
        panel.add(yellow);
        panel.add(green);
        panel.add(blue);
        panel.add(indigo);
        panel.add(violet);
        panel.add(empty);
        panel.add(score_0);
        panel.add(score_1);

    }
    @Override
    public void actionPerformed(ActionEvent e) 
    {
        
    }


   /* public static void pattern()
    {
        Random num = new Random();
        int number;

        for(int count=0; count<=4; count++){
            number = num.nextInt(4);
        }
    } */
}
 
