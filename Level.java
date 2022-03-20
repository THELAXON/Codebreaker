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
    private static int[] cc = Codemaker.getcodemake();                  // Uses the codemaker class to get computer generated code to decide if the player guesses correct
    private static JFrame frame = new JFrame("Code Breaker");           // Naming the frame
    private static ImageIcon[] icons = new ImageIcon[10];               // Array to store image icons given
    private static JButton[] buttons = new JButton[7];                  // Button array to keep buttons seperately
    private static JLabel[] labels = new JLabel[42];                    // Empty Label size will change to adjust the rows and length
    private static JLabel[] clabels = new JLabel[42];                   // This is the checking labels array
    private static JPanel bpanel = new JPanel();                        // Button panel to hold buttons
    private static JPanel gpanel = new JPanel();                        // Row panel to hold the empty icons
    private static JPanel cpanel = new JPanel();                        // Checking panel holds empty icons
    private static int[] pc = new int[arraylength];                     // This is the player choices which will keep resetting for every row
    private static boolean[] checkingp = new boolean[arraylength];
    private static boolean[] checkingc = new boolean[arraylength];
    private static int p=0,k=0,j=0,g=0,q=0,blackcounter=0,whitecounter=0;
    private static int score=0;
    public Level()
    {
        Arrays.fill(checkingp, Boolean.FALSE);
        Arrays.fill(checkingc, Boolean.FALSE);
        new Codemaker();
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
        System.out.println("This is the code"+Arrays.toString(cc));
    }
    public void checkfull()
    {
        if(j==arraylength)
        {   
            score++;
            if(Arrays.equals(cc, pc))
            {
                new Winners();
            }
            for(int i=0;i<arraylength;i++)
            {
                if(pc[i] == cc[i] && checkingp[i] == false && checkingc[i] == false)
                {
                    blackcounter++;
                    checkingc[i] = true;
                    checkingp[i] = true;
                }
            }
            for(int i=0;i<arraylength;i++)
            {
                for(int j=0;j<arraylength;j++)
                {               //2
                    if(pc[j]==cc[i] && checkingc[i]== false && checkingp[j]== false)
                    {
                        whitecounter++;
                        checkingp[j] = true;
                        checkingc[i] = true;
                    }
                }
            }
            System.out.println("Black counters:"+blackcounter);
            System.out.println("White counters:"+whitecounter);
                for(int j=0;j<blackcounter;j++){
                    clabels[g].setIcon(icons[8]);
                    g++;
                }
                for(int p=0;p<whitecounter;p++){
                    clabels[g].setIcon(icons[9]);
                    g++;
                }
                int total = whitecounter + blackcounter;
                for(int q=0;q<arraylength-total;q++){
                    clabels[g].setIcon(icons[7]);
                    g++;
                }
            blackcounter = 0;
            whitecounter = 0;
            for(int y=0;y<arraylength;y++)
            {
                pc[y] = 0;
            }
                j=0;
            Arrays.fill(checkingp, Boolean.FALSE);
            Arrays.fill(checkingc, Boolean.FALSE);
            
        }
    }
    @Override
    public void actionPerformed(ActionEvent e) 
    {
        if(score == 6){
            frame.setVisible(false);
            
        }
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
            pc[j]=k;
            j++;
            checkfull();
            System.out.println(Arrays.toString(pc));  
    }
    public static int getscore() {
        return score;
    }
}

 

