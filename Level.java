import javax.swing.*;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;


public class Level implements ActionListener
{
    static int[] playerchoice = new int[4];
    private JFrame frame = new JFrame("Code Breaker Game");
    private static JPanel panel = new JPanel();
    private static JButton buttons[] = new JButton[7];
    private static JLabel labels[] = new JLabel[24];
    private static ImageIcon icons[] = new ImageIcon[10];
    int x=0;
    public Level()
    {
        for(int i=0; i <=9;i++)
        {
            icons[i] = new ImageIcon(String.valueOf(i)+".png");
        }
        for(int i=0,j=0; i<=6;i++)
        {
            buttons[i] = new JButton();
            buttons[i].setIcon(icons[i]);
            buttons[i].addActionListener(this);
            buttons[i].setBounds(j,320,50,50);
            
            panel.add(buttons[i]);
            j = j + 50;

        }
        for(int j=0,p=0; j<=5;j++)
        {
            for(int i=0,y=0; i<=3;i++)
            {
                labels[x] = new JLabel();
                labels[x].setIcon(icons[7]);
                labels[x].setBounds(y,255 + p,50,50);
                panel.add(labels[x]);
                y = y + 60;
                x++;
            }
            p = p - 65;

        }

        frame.setSize(367, 410);
        frame.setResizable(false);
        frame.setContentPane(panel);
        frame.setLayout(null);
        frame.getContentPane().setBackground(new Color(0x996600)); 
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }
    int p=0,k=0,j=0;
    @Override
    public void actionPerformed(ActionEvent e) 
    {
        for(int i=0;i<=6;i++)
        {
            if(e.getSource()== buttons[i])                                         
            {
                if(labels[p].getIcon()==icons[7])
                {
                    labels[p].setIcon(buttons[i].getIcon());
                    p++;
                    playerchoice[j]= i;
                    j++;

                    if(j==5)
                    {
                        for(p=0;p<3;p++)
                        {
                            playerchoice[p] = 0;
                        }
                        j=0;
                    }
                }      
                                                          
            }
        }

            System.out.println(Arrays.toString(playerchoice));
    }

    public static int[] getplayerchoice() {
        return playerchoice;
    }
}
 
