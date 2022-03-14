import javax.swing.*;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//import java.util.Random;

public class EasyLevel implements ActionListener
{
    //private static int codemaker[];
    //private static int playerchoice[];
    private JFrame frame = new JFrame("Code Breaker Game");
    private static JPanel panel = new JPanel();
    private static JButton buttons[] = new JButton[7];
    private static JLabel labels[] = new JLabel[24];
    private static ImageIcon icons[] = new ImageIcon[10];
    int x=0;
    public EasyLevel()
    {
        for(int i=0,j=0; i <=9;i++)
        {
            icons[i] = new ImageIcon(String.valueOf(j)+".png");
            j++;
        }
        for(int i=0,j=0; i<=6;i++)
        {
            buttons[i] = new JButton();
            buttons[i].setIcon(icons[i]);
            buttons[i].addActionListener(this);
            buttons[i].setBounds(j,360,50,50);
            
            panel.add(buttons[i]);
            j = j + 50;

        }
        for(int j=0,p=0; j<=5;j++)
        {
            for(int i=0,y=0; i<=3;i++)
            {
                labels[x] = new JLabel();
                labels[x].setIcon(icons[7]);
                labels[x].setBounds(y,310 + p,50,50);
                panel.add(labels[x]);
                y = y + 50;
                x++;
            }
            p = p - 50;

        }

        //buttons[1].addActionListener(this);
        frame.setSize(365, 450);
        frame.setResizable(false);
        frame.setContentPane(panel);
        frame.setLayout(null);
        frame.getContentPane().setBackground(new Color(0x996600)); 
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) 
    {
        for(int j=0;j<=3;j++)
        {
            for(int i=0;i<=6;i++)
            {
                if(e.getSource()== buttons[i])                                            // An if statement is used to compare what button was clicked
                {
                icons[i] = new ImageIcon(String.valueOf(i)+".png");
                //ImageIcon colour = new ImageIcon("0.png");
                labels[j].setIcon(icons[i]);                                                        // Goes to the function directed by the if statement
                }
            }
        }
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
 
