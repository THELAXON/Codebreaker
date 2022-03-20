import java.util.Random;

public class Codemaker
{
    private static int length = CodeBreaker.getarraylength();               // Gets the array length from codebreaker
    private static int[] codemake = new int[length];                        // Creates the array 
    
    public Codemaker()                                                      
    {
        Random num = new Random();                                          // Instance of random class made
        for(int i=0;i<=length-1;i++)                                        // Generates random numbers until the array length is reached
        {
            int x = num.nextInt(7);                                         // Chooses random number from 0 to 6
            codemake[i] = x;                                                // Stores it into that array
        }
    }
    public static int[] getcodemake()                                       // Getter method to be used by another class
    {
        return codemake;                                                    // Returns the array
    }
}