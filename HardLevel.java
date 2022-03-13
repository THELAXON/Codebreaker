import javax.swing.*;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//import java.util.Random;


public class HardLevel implements ActionListener
{
    //private static int codemaker[];
    //private static int playerchoice[];
    private JFrame frame = new JFrame("Code Breaker Game");
    private JPanel panel = new JPanel();
    private static JButton buttons[] = new JButton[7];
    private static JLabel labels[] = new JLabel[6];
    private static ImageIcon icons[] = new ImageIcon[10];
    int j = 0, y=0;
    public HardLevel()
    {

        for(int i = 0; i <=9;i++)
        {
            icons[i] = new ImageIcon(String.valueOf(j)+".png");
            j++;
        }

        for(int i=0; i<=6;i++)
        {
            buttons[i] = new JButton();
            buttons[i].setIcon(icons[i]);
            buttons[i].setBounds(-10+j,510,50,50);
            //buttons[i].setIcon(icons[i]);
            panel.add(buttons[i]);
            j = j + 50;

        }

        for(int i=0; i<=5;i++)
        {
            labels[i] = new JLabel();
            labels[i].setBounds(y,460,50,50);
            panel.add(labels[i]);
            y = y + 50;
        }

        frame.setSize(365, 600);
        frame.setResizable(false);
        frame.setContentPane(panel);
        frame.setLayout(null);
        frame.getContentPane().setBackground(new Color(0x996600)); 
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        /*labels[0].setIcon(emptyicon);
        labels[1].setIcon(emptyicon);
        labels[2].setIcon(emptyicon);
        labels[3].setIcon(emptyicon);
        labels[4].setIcon(score_0icon);
        labels[5].setIcon(score_1icon);*/
        frame.setVisible(true);

    }
    @Override
    public void actionPerformed(ActionEvent e) 
    {
        if(e.getSource()== buttons[0])                                            // An if statement is used to compare what button was clicked
        {
            redchange();                                                         // Goes to the function directed by the if statement
        }
    }

    public static void redchange()
    {
        ImageIcon redicon = new ImageIcon("0.png");
        labels[0].setIcon(redicon);
    }

    /*public static void pattern()
    {
        Random num = new Random();
        int number;

        for(int count=0; count<=4; count++){
            number = num.nextInt(4);

            codemaker[count]= number;
        }
    }*/
}
 
