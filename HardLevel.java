import javax.swing.*;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HardLevel implements ActionListener
{
    private JFrame frame = new JFrame("Code Breaker Game");
    /*Menu menu = new Menu();
    int length = menu.getlength();
    int rows = menu.getrows();*/
    int rows = 4;
    int length = 4;
    private static JPanel bpanel = new JPanel();
    private static JPanel[] rpanels = new JPanel[6];
    Rows row = new Rows();
    private static JButton buttons[] = new JButton[7];
    private static JLabel labels[] = new JLabel[8];
    private static ImageIcon icons[] = new ImageIcon[10];
    public HardLevel()
    {
        
        for(int i=0; i<=9;i++)
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
        for(int i=0,j=0; i<=6;i++)
        {
            rpanels[i] =rows.createrow();
        }


        for (int j=0,p=0;j<=rows;j++)
        {
            rpanels[j].setLayout(null);
            rpanels[j].setBounds(0,250+p,450,50);
            rpanels[j].setBackground(new Color(0x996600));
            frame.add(rpanels[j]);
            p = p-50;
        }

        
        frame.setSize(465, 390);
        frame.setLayout(null);
        frame.setResizable(false);
        frame.add(bpanel);
        bpanel.setLayout(null);
        bpanel.setBounds(0,300,450,50);
        bpanel.setBackground(new Color(0x996600));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    int p =0,j=0;
    @Override
    public void actionPerformed(ActionEvent e) 
    {
        for(int k=0;k<5;k++)
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
}
 
