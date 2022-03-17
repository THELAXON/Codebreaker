import java.util.Random;

public class Codemaker
{
    static int[] codemake = new int[4];
    public void generate()
    {
        Random num = new Random();
        for(int i=0;i<=3;i++)
        {
            int x = num.nextInt(3);
            codemake[i] = x;
        }
    }
    public static int[] getcodemake() {
        return codemake;
    }
}