import javax.swing.*;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MediumLevel implements ActionListener
{
    private JFrame frame = new JFrame("Code Breaker Game");
    private static JPanel bpanel = new JPanel();
    private static JPanel rpanel = new JPanel();
    private static JButton buttons[] = new JButton[7];
    private static JLabel labels[] = new JLabel[36];
    private static ImageIcon icons[] = new ImageIcon[10];
    int x=0;
    public MediumLevel()
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
            buttons[i].setBounds(j,0,50,50);
            bpanel.add(buttons[i]);
            j = j + 50;

        }

        for(int j=0,p=0; j<=5;j++)
        {
            for(int i=0,y=0; i<=5;i++)
            {
                labels[x] = new JLabel();
                labels[x].setIcon(icons[7]);
                labels[x].setBounds(y,0,50,50);
                rpanel.add(labels[x]);
                y = y + 50;
                x++;
            }
            p = p - 50;

        }

        frame.setSize(465, 450);
        frame.setLayout(null);
        frame.setResizable(false);
        frame.add(bpanel);
        frame.add(rpanel);
        rpanel.setLayout(null);
        rpanel.setBounds(0,313,450,50);
        rpanel.setBackground(new Color(0x996600));
        rpanel.setLayout(null);
        bpanel.setBounds(0,363,450,50);
        bpanel.setBackground(new Color(0x996600));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    int p =0,j=0;
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
                }                                             
            }
        }
    }
}
 
