import java.util.Random;

public class Codemaker
{
    private static int length = CodeBreaker.getarraylength();
    static int[] codemake = new int[length];
    
    public Codemaker()
    {
        Random num = new Random();
        for(int i=0;i<=length;i++)
        {
            int x = num.nextInt(7);
            codemake[i] = x;
        }
    }
    public static int[] getcodemake() {
        return codemake;
    }
    public static boolean win()
    {
        for(int i=0;i<Level.getplayerchoice().length;i++)
            {
                for(int j=0;j<codemake.length;j++)
                {
                    if(Level.getplayerchoice()[i] == Codemaker.getcodemake()[j])
                    {
                        System.out.println("You won");
                        return true;
                    }
                }
            }
        return false;
    }
}