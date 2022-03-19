import javax.swing.*;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

public class Level implements ActionListener
{   
    private static int length = CodeBreaker.getlength();                // Gets the length of guesses needed per row
    private static int rows = CodeBreaker.getrows();                    // Gets the rows of guess needed per row
    private static int arraylength = CodeBreaker.getarraylength();      // Decides what size the array should be
    private static Codemaker hi = new Codemaker();
    private static int[] computerchoice = Codemaker.getcodemake();                      // Uses the win class to decide if the player guesses correct
    //private static boolean win = Codemaker.win();
    private static JFrame frame = new JFrame("Code Breaker");                  // Naming the frame
    private static ImageIcon icons[] = new ImageIcon[10];               // Array to store image icons given
    private static JButton buttons[] = new JButton[7];                  // Button array to keep buttons seperately
    private static JLabel labels[] = new JLabel[42];                    // Empty Label size will change to adjust the rows and length
    private static JLabel clabels[] = new JLabel[42];                   // This is the checking labels array
    private static JPanel bpanel = new JPanel();                        // Button panel to hold buttons
    private static JPanel gpanel = new JPanel();                        // Row panel to hold the empty icons
    private static JPanel cpanel = new JPanel();                        // Checking panel holds empty icons
    private static int[] pc = new int[arraylength];                     // This is the player choices which will keep resetting for every row
    
    public Level()
    {
        for(int i=0; i <=9;i++)                                         // Adding images to the icon array
        {
            icons[i] = new ImageIcon(String.valueOf(i)+".png");         // Converts to string the number used to name file and stores it into array
        }
        
        for(int i=0;i<=(length*rows)-1;i++)                             // Creates enough empty labels for the grid layout      
        {
            clabels[i] = new JLabel();                                  // Assigns a new jlabel into the array
            clabels[i].setIcon(icons[7]);                               // sets the empty icon as the icon for the label
            cpanel.add(clabels[i]);                                     // Adds the label to the checking panel
        }

        for(int i=0;i<=(length*rows)-1;i++)                             // Creates enough empty labels for the grid layout
        {
            labels[i] = new JLabel();                                   // Assigns a new jlabel into the array
            labels[i].setIcon(icons[7]);                                // sets the empty icon as the icon for the label
            gpanel.add(labels[i]);                                      // Adds the label to the guess panel
        }

        
        for(int i=0;i<=6;i++)                                           // Needs to loop 7 times to create 7 buttons
        {
            buttons[i] = new JButton();                                 // Assigns the button to the button array
            buttons[i].setIcon(icons[i]);                               // Assigns the icon representing each button
            buttons[i].addActionListener(this);                         // Adds action listener to the button so program can react to various inputs
            bpanel.add(buttons[i]);                                     // Adds the button to the button panel
        }


        cpanel.setLayout(new GridLayout(rows*2,length/2,0,0));          // Using grid layout for checking panel for better space usage
        cpanel.setBounds(350,20,130,450);                               // Giving bounds for the panel so checks take place in that area of the frame
        cpanel.setBackground(new Color(0x996600));                      // Background colour has to match the other backgrounds in the frame for consistency
        bpanel.setLayout(new GridLayout(1,7,0,0));                      // Using grid layout for the button panel
        bpanel.setBounds(60,510,350,50);                                // Giving set bounds to the bottom of the frame
        bpanel.setBackground(new Color(0x996600));                      // Background colour has to match the other backgrounds in the frame for consistency
        gpanel.setLayout(new GridLayout(rows,length,0,30));             // Grid layout for the game panel
        gpanel.setBounds(0,20,350,450);                                 
        gpanel.setBackground(new Color(0x996600));
        frame.add(bpanel);
        frame.add(gpanel);
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
        //System.out.println("This is the code"+Arrays.toString(computerchoice));
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
                if(j==arraylength)
                {
                    //System.out.println(Arrays.toString(computerchoice));
                    for(int i=0;i<pc.length;i++)
                    {
                        for(int j=0;j<computerchoice.length;j++)
                        {
                            if(pc[i] == computerchoice[j])
                            {
                                System.out.println("You won");
                            }
                        }
                    }
                    //if(win == true)
                    //{
                    //   frame.setVisible(false);
                    //    new Winners();
                    //}
                    for(int y=0;y<arraylength;y++){
                        pc[y] = 0;
                    }
                    j=0;
                }
                pc[j]=k;
                j++;
                System.out.println(Arrays.toString(pc));
    }

    public static int getarraylength() 
    {
        return arraylength;
    }
    public static int[] getpc() 
    {
        return pc;
    }
}
 
