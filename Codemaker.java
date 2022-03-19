import java.util.Random;
import java.util.Arrays; 

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
        System.out.println(Arrays.toString(codemake));
    }

    public static int[] getcodemake() 
    {
        return codemake;
    }
}