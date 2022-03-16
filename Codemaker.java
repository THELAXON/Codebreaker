import java.util.Random;

public class Codemaker
{
    int[] codemake = new int[4];
    public void generate()
    {
        Random num = new Random();
        for(int i=0;i<=3;i++)
        {
            int x = num.nextInt(3);
            codemake[i] = x;
        }
    }
}