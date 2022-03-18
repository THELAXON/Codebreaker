import javax.swing.*;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

public class Level implements ActionListener
{   
    private static int length = CodeBreaker.getlength();
    private static int rows = CodeBreaker.getrows();
    private static int arraylength = CodeBreaker.getarraylength();
    //private static int[] computerchoice = Codemaker.getcodemake();
    private JFrame frame = new JFrame("Code Breaker");                  // Naming the frame
    private static ImageIcon icons[] = new ImageIcon[10];               // Array to store image icons given
    private static JButton buttons[] = new JButton[7];                  // Button array to keep buttons seperately
    private static JLabel labels[] = new JLabel[42];                    // JLabel size will change to adjust the rows and length
    private static JLabel clabels[] = new JLabel[42];
    private static JPanel bpanel = new JPanel();                        // Button panel to hold buttons
    private static JPanel rpanel = new JPanel();                        // Row panel to hold the empty icons
    private static JPanel cpanel = new JPanel();
    static int[] playerchoice = new int[arraylength];
    
    
    public Level()
    {
        for(int i=0; i <=9;i++)                                         //Adding images to the icon array
        {
            icons[i] = new ImageIcon(String.valueOf(i)+".png");  // Converts to string the number used to name file and stores it into array
        }
        
        for(int i=0;i<=(length*rows)-1;i++)
        {
            clabels[i] = new JLabel();
            clabels[i].setIcon(icons[7]);
            cpanel.add(clabels[i]);
        }

        for(int i=0;i<=(length*rows)-1;i++)
        {
            labels[i] = new JLabel();
            labels[i].setIcon(icons[7]);
            rpanel.add(labels[i]);
        }

        
        for(int i=0;i<=6;i++)
        {
            buttons[i] = new JButton();
            buttons[i].setIcon(icons[i]);
            buttons[i].addActionListener(this);
            bpanel.add(buttons[i]);
        }


        cpanel.setLayout(new GridLayout(rows*2,length/2,0,0));
        cpanel.setBounds(350,20,130,450);
        cpanel.setBackground(new Color(0x996600));

        bpanel.setLayout(new GridLayout(1,7,0,0));
        bpanel.setBounds(60,510,350,50);
        bpanel.setBackground(new Color(0x996600));
        rpanel.setLayout(new GridLayout(rows,length,0,30));
        rpanel.setBounds(0,20,350,450);
        rpanel.setBackground(new Color(0x996600));
        frame.add(bpanel);
        frame.add(rpanel);
        frame.add(cpanel);
        frame.setSize(500, 600);
        frame.setResizable(false);
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
                    k = i;
                }                                        
            }
        }
                if(j==4)
                {
                    //create instance of win class here
                    for(int y=0;y<arraylength;y++){
                        playerchoice[y] = 0;
                    }
                    j=0;
                }
                playerchoice[j]=k;
                j++;
                System.out.println(Arrays.toString(playerchoice));
}

    public static int getarraylength() {
        return arraylength;
    }
    public static int[] getplayerchoice() {
        return playerchoice;
    }
}
 
