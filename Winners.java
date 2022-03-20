import javax.swing.*;


public class Winners{
    private JFrame frame = new JFrame("Code Breaker");
    private JLabel win = new JLabel("You won!");
    private JLabel scoring = new JLabel("It took you "+score+" attempts");
    private JLabel correct = new JLabel("The code was "+code);
    private static JPanel panel = new JPanel();
    private static int score = Level.getscore();
    private static int[] code = Codemaker.getcodemake();

    public Winners(){



        panel.setBounds(0,0,300,200);
        win.setBounds(0,0,200,100);
        scoring.setBounds(0,300,200,100);
        //scoring.setBounds(0,100,100,100);
        frame.add(panel);
        panel.add(win);
        panel.add(scoring);
        frame.setSize(300,200);
        frame.setVisible(true);

    }
}