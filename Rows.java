import javax.swing.*;

public class Rows {
    public static int length = 3;
    private static JPanel row = new JPanel();
    private static JLabel labels[] = new JLabel[8];
    private static ImageIcon icons[] = new ImageIcon[10];
    public Rows(){
        createrow();
    }
    public void createrow(){
        for(int i=0; i <=9;i++)
        {
            icons[i] = new ImageIcon(String.valueOf(i)+".png");
        }

            for(int i=0,y=0;i<=length;i++)
            {
                labels[i] = new JLabel();
                labels[i].setIcon(icons[7]);
                labels[i].setBounds(y,0,50,50);
                row.add(labels[i]);
                y = y + 50;
            }
        }

}
