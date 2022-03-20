import javax.swing.*;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

/**
 * This is the main game frame where as the levels are chosen the game frame is adjusted accordingly
 */

public class Level implements ActionListener
{   
    private static int length = CodeBreaker.getlength();                                // Gets the length of guesses needed per row
    private static int rows = CodeBreaker.getrows();                                    // Gets the rows of guess needed per row
    private static int arraylength = CodeBreaker.getarraylength();                      // Decides what size the array should be
    private static int[] cc = Codemaker.getcodemake();                                  // Uses the codemaker class to get computer generated code to decide if the player guesses correct
    private static JFrame frame = new JFrame("Code Breaker");                           // Naming the frame
    private static ImageIcon[] icons = new ImageIcon[10];                               // Array to store image icons given
    private static JButton[] buttons = new JButton[7];                                  // Button array to keep buttons seperately
    private static JLabel[] labels = new JLabel[42];                                    // Empty Label size will change to adjust the rows and length
    private static JLabel[] clabels = new JLabel[42];                                   // This is the checking labels array
    private static JPanel bpanel = new JPanel();                                        // Button panel to hold buttons
    private static JPanel gpanel = new JPanel();                                        // Row panel to hold the empty icons
    private static JPanel cpanel = new JPanel();                                        // Checking panel holds empty icons
    private static int[] pc = new int[arraylength];                                     // This is the player choices which will keep resetting for every row
    private static boolean[] checkingp = new boolean[arraylength];                      // Checking array to check for duplicates for player choice
    private static boolean[] checkingc = new boolean[arraylength];                      // Checking array to check for duplicates for computer choice
    private static int p=0,k=0,j=0,g=0;                                                 // Variables used for various purposes within the class
    private static int score=0,blackcounter=0,whitecounter=0;                           // Variables used for scoring
    public Level()
    {
        new Codemaker();                                                                // Runs codemaker to create an array of code that the user will need to guess
        for(int i=0; i <=9;i++)                                                         // Adding images to the icon array
        {
            icons[i] = new ImageIcon(String.valueOf(i)+".png");                         // Converts to string the number used to name file and stores it into array
        }
        
        for(int i=0;i<=(length*rows)-1;i++)                                             // Creates enough empty labels for the grid layout      
        {
            clabels[i] = new JLabel();                                                  // Assigns a new jlabel into the array
            clabels[i].setIcon(icons[7]);                                               // sets the empty icon as the icon for the label
            cpanel.add(clabels[i]);                                                     // Adds the label to the checking panel
        }

        for(int i=0;i<=(length*rows)-1;i++)                                             // Creates enough empty labels for the grid layout
        {
            labels[i] = new JLabel();                                                   // Assigns a new jlabel into the array
            labels[i].setIcon(icons[7]);                                                // sets the empty icon as the icon for the label
            gpanel.add(labels[i]);                                                      // Adds the label to the guess panel
        }

        for(int i=0;i<=6;i++)                                                           // Needs to loop 7 times to create 7 buttons
        {
            buttons[i] = new JButton();                                                 // Assigns the button to the button array
            buttons[i].setIcon(icons[i]);                                               // Assigns the icon representing each button
            buttons[i].addActionListener(this);                                         // Adds action listener to the button so program can react to various inputs
            bpanel.add(buttons[i]);                                                     // Adds the button to the button panel
        }
        cpanel.setLayout(new GridLayout(rows*2,length/2,0,0));                          // Using grid layout for checking panel for better space usage
        cpanel.setBounds(350,20,130,450);                                               // Giving bounds for the panel so checks take place in that area of the frame
        cpanel.setBackground(new Color(0x996600));                                      // Background colour has to match the other backgrounds in the frame for consistency
        bpanel.setLayout(new GridLayout(1,7,0,0));                                      // Using grid layout for the button panel
        bpanel.setBounds(60,510,350,50);                                                // Giving set bounds to the bottom of the frame
        bpanel.setBackground(new Color(0x996600));                                      // Background colour has to match the other backgrounds in the frame for consistency
        gpanel.setLayout(new GridLayout(rows,length,0,30));                             // Grid layout for the game panel
        gpanel.setBounds(0,20,350,450);                                                 // Sets bounds for the game panel           
        gpanel.setBackground(new Color(0x996600));                                      // Sets background colour for the game panel
        frame.add(bpanel);                                                              // Adds the button panel to the frame
        frame.add(gpanel);                                                              // Adds the game panel to the frame
        frame.add(cpanel);                                                              // Adds the checking panel to the frame
        frame.setSize(500, 600);                                                        // Sets the size of the frame
        frame.setResizable(false);                                                      // Doesn't allow player to change size of the frame
        frame.setLayout(null);                                                          // Null layout for the frame
        frame.getContentPane().setBackground(new Color(0x996600));                      // Sets background colour for the frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);                           // Allows the player to exit the frame when it is closed
        frame.setVisible(true);                                                         // Makes the frame visible
        Arrays.fill(checkingp, Boolean.FALSE);                                          // Fills the array with boolean being false
        Arrays.fill(checkingc, Boolean.FALSE);                                          // Fills the array with boolean being false
    }
    public void checkfull()                                                             // Method to check if array is full
    {
        if(j==arraylength)                                                              // Condition statement if the array is full
        {   
            score++;                                                                    // Adds 1 to scoring variable to used in number of attempts by winners class
            if(Arrays.equals(cc, pc))                                                   // If statement to check if all indexes of both arrays are equal
            {
                frame.dispose();
                new Winners();                                                          // If it is true then an instance of the winners class is created
            }
            for(int i=0;i<arraylength;i++)                              
            {
                if(pc[i] == cc[i] && checkingp[i] == false && checkingc[i] == false)    // Condition to check if indexes are true but also to check if the boolean arrays are true to stop duplicates
                {
                    blackcounter++;                                                     // Adds to black counter for scoring purposes
                    checkingc[i] = true;                                                // If the condition is met then these are set to true to avoid duplicates
                    checkingp[i] = true;                                                // If the condition is met then these are set to true to avoid duplicates
                }
            }
            for(int i=0;i<arraylength;i++)
            {
                for(int j=0;j<arraylength;j++)
                {
                    if(pc[j]==cc[i] && checkingc[i]== false && checkingp[j]== false)    // Condition to check if indexes are true but also to check if the boolean arrays are true to stop duplicates
                    {
                        whitecounter++;                                                 // Adds to white counter for scoring purposes
                        checkingp[j] = true;                                            // If the condition is met then these are set to true to avoid duplicates
                        checkingc[i] = true;                                            // If the condition is met then these are set to true to avoid duplicates
                    }
                }
            };
                for(int j=0;j<blackcounter;j++){                                        // Using the blackcounter variable to replace label icons
                    clabels[g].setIcon(icons[8]);                                       // Replaces the empty label icon to black label icon
                    g++;                                                                // This is global to the class and increments when a labels value gets changed
                }
                for(int p=0;p<whitecounter;p++){                                        // Using the whitecounter variable to replace label icons
                    clabels[g].setIcon(icons[9]);                                       // Replaces the empty label icon to white label icon
                    g++;                                                                // This is global to the class and increments when a labels value gets changed
                }
                int total = whitecounter + blackcounter;                                // Collecting the total of white and black counters from the attempt
                for(int q=0;q<arraylength-total;q++){                                   // Condition statement to find the number of empty icons needed to be replaced
                    clabels[g].setIcon(icons[7]);                                       // Replaces the empty label icon to the empty label icon.
                    g++;                                                                // This is global to the class and increments when a labels value gets changed
                }
            blackcounter = 0;                                                           // After the attempt check is finished the black counter gets reset for the next attempt
            whitecounter = 0;                                                           // After the attempt check is finished the white counter gets reset for the next attempt
            for(int y=0;y<arraylength;y++)                                              // Condition statement to set all values back to 0 in the playerchoice array
            {
                pc[y] = 0;                                                              // Sets each index value to 0
            }
                j=0;                                                                    // Sets j to 0 so index won't be out of bounds
            Arrays.fill(checkingp, Boolean.FALSE);                                      // Resets the boolean array to false for next attempt
            Arrays.fill(checkingc, Boolean.FALSE);                                      // Resets the boolean array to false for next attempt
            if(score == 6){                                                             // This is to check the number of attempts taken place
                frame.dispose();                                                        // Max attempts is 6 so the frame would be closed
                new Losers();
            }
        }
    }
    @Override
    public void actionPerformed(ActionEvent e)                                          // The action event method to determine what takes place after the buttons with action listener is clicked
    {
        
        for(int i=0;i<=6;i++)                                                           // Loops until i becomes 6 to check which button was clicked
        {
            if(e.getSource()== buttons[i])                                              // Button index increments to check what button the input was
            {
                if(labels[p].getIcon()==icons[7])                                       // Checks if the label meant to filled is empty in the first place          
                {
                    labels[p].setIcon(buttons[i].getIcon());                            // Sets the icon of that label to the colour of the button that was chosen
                    p++;                                                                // Increments the set label by 1
                    k = i;                                                              // If the condition if fulfilled then the index gets stored in a variable
                }                                        
            }
        }
            pc[j]=k;                                                                    // The stored variable would then get stored into the playerchoice array
            j++;                                                                        // Increments by 1 as j is used to check when the number of choices if filled
            checkfull();                                                                // Checks if the attempt is full and check if conditions are met in that method
    }
    public static int getscore() {                                                      // Getter method used by another class
        return score;                                                                   // Score is returned
    }
}

 

