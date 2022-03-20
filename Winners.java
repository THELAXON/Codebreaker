import javax.swing.*;
import java.awt.Color;
import java.awt.Font;
import java.util.Arrays;

public class Winners{
    private JFrame frame = new JFrame("Code Breaker");                          // Creates a Jframe which is named codebreaker
    private JLabel win = new JLabel("You have guessed Correctly!");             // Displays that the player won
    private JLabel scoring = new JLabel("You used "+ score +" attempts");       // Displays the number of attempts the player takes
    private JLabel answerline = new JLabel("The answer was:");                  // Creating space to display answer
    private JLabel answer = new JLabel(Arrays.toString(code));                  // Convert the code to string so it can be dislayed in that label
    private JLabel coloured = new JLabel("Colours:0=R,1=O,2=Y,3=G,4=B,5=I,6=V");// All the colours in a seperate label
    private static JPanel panel = new JPanel();                                 // Create a Jpanel as a container for the objects within it
    private static int score = Level.getscore();                                // Getter is used to get the number of attempts taken
    private static int[] code = Codemaker.getcodemake();
    public Winners(){
        win.setBounds(60,0,400,200);                                            // Set bounds for JLabel
        scoring.setBounds(110,30,400,200);                                      // Set bounds for JLabel
        answerline.setBounds(110,60,400,200);                                   // Set bounds for JLabel
        answer.setBounds(110,90,400,200);                                       // Set bounds for JLabel
        coloured.setBounds(45,120,400,200);                                     // Set bounds for JLabel
        win.setForeground(Color.pink);                                          // Set colour for JLabel
        scoring.setForeground(Color.WHITE);                                     // Set colour for JLabel
        answerline.setForeground(Color.WHITE);                                  // Set colour for JLabel
        answer.setForeground(Color.WHITE);                                      // Set colour for JLabel
        coloured.setForeground(Color.WHITE);                                    // Set colour for JLabel
        win.setFont(new Font("MV Boli",Font.BOLD,20));                          // Set font and size for JLabel
        scoring.setFont(new Font("MV Boli",Font.BOLD,15));                      // Set font and size for JLabel
        answerline.setFont(new Font("MV Boli",Font.BOLD,15));                   // Set font and size for JLabel
        answer.setFont(new Font("MV Boli",Font.BOLD,15));                       // Set font and size for JLabel
        coloured.setFont(new Font("MV Boli",Font.BOLD,15));                     // Set font and size for JLabel
        frame.setContentPane(panel);                                            // Set Jpanel as content pane
        frame.getContentPane().setBackground(Color.BLACK);                      // Set background for the frame
        panel.add(win);                                                         // Adds the win label to the panel
        panel.add(scoring);                                                     // Adds the scoring label to the panel
        panel.add(answerline);                                                  // Adds the answerline label to the panel
        panel.add(answer);                                                      // Adds the answer label to the panel
        panel.add(coloured);                                                    // Adds the coloured label to the panel
        frame.setResizable(false);                                              // Player shouldn't resize the frame
        frame.setLayout(null);                                                  // Set layout to null
        frame.setSize(400,400);                                                 // Sets the size for the Jframe
        frame.setVisible(true);                                                 // Sets the frame visible
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);                   // Closes when player hits the red x button
    }
}