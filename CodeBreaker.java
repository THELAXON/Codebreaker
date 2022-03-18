import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.GridLayout;

public class CodeBreaker implements ActionListener                          // This is the main page and action listener is implemented so it reacts to user input
{
    private static int length;
    private static int rows;
    private static int arraylength;
    private static JButton[] buttons = new JButton[3];
    private static String[] names = {"Easy", "Medium", "Hard"};
    private static JFrame frame = new JFrame("Code Breaker: Choose Level");  // The exe is titled Code Breaker 
    private static JPanel bpanel = new JPanel();                             // A panel is made to showcase all components in it
    public CodeBreaker()
    {
        for(int i=0;i<=2;i++)
        {
            buttons[i] = new JButton(names[i]);
            buttons[i].addActionListener(this);
            bpanel.add(buttons[i]);
        }
        bpanel.setBounds(0,0,300,350);
        bpanel.setLayout(new GridLayout(3,1,0,0));
        frame.add(bpanel);    
        frame.setSize(350,400);                                             // Giving set dimensions for the frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);               // This allows for the exe to close and not continue running when close button is inputted
        frame.setVisible(true);                                             // The frame needs to be visible so the user can see the exe window
    }
    public void actionPerformed(ActionEvent e)                              // This function allows the program to react to input due to action listener
    {
        if(e.getSource()== buttons[0])                                            // An if statement is used to compare what button was clicked
        {
            easy();                                                         // Goes to the function directed by the if statement
        }
        if(e.getSource()== buttons[1])                                          // An if statement is used to compare what button was clicked
        {
            medium();                                                       // Goes to the function directed by the if statement
        }
        if(e.getSource()== buttons[2])                                            // An if statement is used to compare what button was clicked
        {
            hard();                                                         // Goes to the function directed by the if statement
        }
    } 
    public void easy()
    {
            this.setarraylength(2);
            this.setlength(2);
            this.setrows(6);
            new Level();
            frame.setVisible(false);
    }
    public void medium()
    {    
            this.setarraylength(4);
            this.setlength(4);
            this.setrows(6);
            new Level();
            frame.setVisible(false);
    }
    public void hard()
    {   
        this.setarraylength(6);
        this.setlength(6);
        this.setrows(6);
        new Level();
        frame.setVisible(false);
    }
    public static int getarraylength()
    {
        return arraylength;
    }
    public void setarraylength(int a)
    {
        arraylength = a;
    }
    public static int getlength()
    {
        return length;
    }
    public void setlength(int a)
    {
        length = a;
    }
    public static int getrows()
    {
        return rows;
    }
    public void setrows(int a)
    {
        rows = a;
    }
}