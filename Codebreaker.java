import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Codebreaker implements ActionListener                          // This is the main page and action listener is implemented so it reacts to user input
{
    private static JFrame frame = new JFrame("Code Breaker");               // The exe is titled Code Breaker 
    private static JPanel panel = new JPanel();                             // A panel is made to showcase all components in it
    private static JLabel titles = new JLabel("Welcome to code Breaker");   // Welcomes the player to the game
    private static JButton easy = new JButton("Easy");                      // Button represents the level difficulty
    private static JButton medium = new JButton("Medium");                  // Button represents the level difficulty
    private static JButton hard = new JButton("Hard");                      // Button represents the level difficulty
    public Codebreaker()
    {
        
        easy.setBounds(0,20,285,100);                                       // Chose where the buttons should be
        easy.addActionListener(this);                                       // Action listener is added to the button so the exe responds to input
        easy.setFocusable(false);                                           // This gets rid of the small box around the text for aesthetic purposes
        medium.setBounds(0,120,285,100);                                    // Chose where the buttons should be
        medium.addActionListener(this);                                     // Action listener is added to the button so the exe responds to input
        medium.setFocusable(false);                                         // This gets rid of the small box around the text for aesthetic purposes
        hard.setBounds(0,220,285,100);                                      // Chose where the buttons should be
        hard.addActionListener(this);                                       // Action listener is added to the button so the exe responds to input
        hard.setFocusable(false);                                           // This gets rid of the small box around the text for aesthetic purposes
        panel.add(easy);                                                    // Adds the button to the panel
        panel.add(medium);                                                  // Adds the button to the panel
        panel.add(hard);                                                    // Adds the button to the panel

        titles.setBounds(70,0,150,20);                                      // Chose where the title should be
        panel.add(titles);                                                  // Adds the title label to the panel

        frame.setSize(300,350);                                             // Giving set dimensions for the frame
        frame.setContentPane(panel);                                        // The panel acts as the container for components with this setter
        frame.setLayout(null);                                              // For the main menu there is no set layout
        frame.setResizable(false);                                          // Put resizable to false for aesthetic purposes.
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);               // This allows for the exe to close and not continue running when close button is inputted
        frame.setVisible(true);                                             // The frame needs to be visible so the user can see the exe window

    }
    @Override
    public void actionPerformed(ActionEvent e)                              // This function allows the program to react to input due to action listener
    {
        if(e.getSource()== easy)                                            // An if statement is used to compare what button was clicked
        {
            easy();                                                         // Goes to the function directed by the if statement
        }
        if(e.getSource()== medium)                                          // An if statement is used to compare what button was clicked
        {
            medium();                                                       // Goes to the function directed by the if statement
        }
        if(e.getSource()== hard)                                            // An if statement is used to compare what button was clicked
        {
            hard();                                                         // Goes to the function directed by the if statement
        }
        
        
    } 


    public static void easy()
    {
           EasyLevel easylevel = new EasyLevel();
    }

    public static void medium()
    {    
           MediumLevel easylevel = new MediumLevel(); 
    }

    public static void hard()
    {   
           HardLevel easylevel = new HardLevel();
    }
}