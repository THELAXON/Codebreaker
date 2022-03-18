import java.util.Random;

public class Codemaker
{
    private static int length = CodeBreaker.getarraylength();
    static int[] codemake = new int[4];
    
    public void generate()
    {
        Random num = new Random();
        for(int i=0;i<=length;i++)
        {
            int x = num.nextInt(3);
            codemake[i] = x;
        }
    }
    public static int[] getcodemake() {
        return codemake;
    }
}