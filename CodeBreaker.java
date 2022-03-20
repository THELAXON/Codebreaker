import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.GridLayout;

public class CodeBreaker implements ActionListener                          // This is the main page and action listener is implemented so it reacts to user input
{
    private static int length;                                              // To decide how many inputs there should be per line
    private static int rows;                                                // To decide how many attempts the player has to guess correctly
    private static int arraylength;                                         // Choosing the array size for what the player input is and how long the generated code should be
    private static JButton[] buttons = new JButton[3];                      // This is the main menu so there needs to be three buttons which are easy,medium and hard
    private static String[] names = {"Easy", "Medium", "Hard"};             // Given all three the string names to assign later
    static JFrame frame = new JFrame("Code Breaker: Choose Level");         // The exe is titled Code Breaker 
    private static JPanel bpanel = new JPanel();                            // A panel is made to showcase all components in it
    public CodeBreaker()
    {
        for(int i=0;i<=2;i++)                                               // Loop to create the Jbuttons for the panel
        {
            buttons[i] = new JButton(names[i]);                             // Creates the button and assigns it to a button array
            buttons[i].addActionListener(this);                             // Adds the action listener to the button
            bpanel.add(buttons[i]);                                         // Adds the button to the specific button panel
        }
        bpanel.setBounds(0,0,300,350);                                      // Setting bounds for the button panel
        bpanel.setLayout(new GridLayout(3,1,0,0));                          // Using gridlayout to display the buttons
        frame.add(bpanel);                                                  // Adding the button panel to the frame
        frame.setSize(350,400);                                             // Giving set dimensions for the frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);               // This allows for the exe to close and not continue running when close button is inputted
        frame.setVisible(true);                                             // The frame needs to be visible so the user can see the exe window
    }
    public void actionPerformed(ActionEvent e)                              // This function allows the program to react to input due to action listener
    {
        if(e.getSource()== buttons[0])                                      // An if statement is used to compare what button was clicked
        {
            easy();                                                         // Goes to the function directed by the if statement
        }
        if(e.getSource()== buttons[1])                                      // An if statement is used to compare what button was clicked
        {
            medium();                                                       // Goes to the function directed by the if statement
        }
        if(e.getSource()== buttons[2])                                      // An if statement is used to compare what button was clicked
        {
            hard();                                                         // Goes to the function directed by the if statement
        }
    } 
    public void easy()                                                      // Function that leads to the easy level
    {
            this.setarraylength(2);                                         // Gives the array length that playerchoice and computer code should be
            this.setlength(2);                                              // Number of inputs per row
            this.setrows(6);                                                // Number of attempts player gets
            new Level();                                                    // Opens an instance of the level class which is the game itself
            frame.setVisible(false);                                        // Closes the main menu
    }
    public void medium()                                                    // Function that leads to the medium level
    {    
            this.setarraylength(4);                                         // Gives the array length that playerchoice and computer code should be
            this.setlength(4);                                              // Number of inputs per row needs to be higher for higher difficulty
            this.setrows(6);                                                // Number of attempts player gets
            new Level();                                                    // Opens an instance of the level class which is the game itself
            frame.setVisible(false);                                        // Closes the main menu
    }
    public void hard()                                                      // Function that leads to the hard level           
    {   
        this.setarraylength(6);                                             // Gives the array length that playerchoice and computer code should be
        this.setlength(6);                                                  // Number of inputs per row needs to be higher for higher difficulty
        this.setrows(6);                                                    // Number of attempts player gets
        new Level();                                                        // Opens an instance of the level class which is the game itself
        frame.setVisible(false);                                            // Closes the main menu
    }
    public static int getarraylength()                                      // Getter method to be used by another class
    {
        return arraylength;                                                 // The return value
    }
    public void setarraylength(int a)                                       // Setter method to be used by another class
    {
        arraylength = a;                                                    // Sets the parameter to the variable
    }
    public static int getlength()
    {
        return length;                                                      // The return value
    }
    public void setlength(int a)                                            // Setter method to be used by another class
    {
        length = a;                                                         // Sets the parameter to the variable
    }
    public static int getrows()                                             // Getter method to be used by another class
    {
        return rows;                                                        // The return value
    }
    public void setrows(int a)                                              // Setter method to be used by another class
    {
        rows = a;                                                           // Sets the parameter to the variable
    }
}