import java.util.Random;

public class Codemaker
{
    private static int length = CodeBreaker.getarraylength();
    private static int[] codemake = new int[length];
    
    public Codemaker()
    {
        Random num = new Random();
        for(int i=0;i<=length-1;i++)
        {
            int x = num.nextInt(6);
            codemake[i] = x;
        }
    }

    public static int[] getcodemake() 
    {
        return codemake;
    }
}