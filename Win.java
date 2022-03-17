public class Win
{
    public Win()
    {
        for(int i=0;i<Level.getplayerchoice().length;i++)
            {
                for(int j=0;j<Codemaker.getcodemake().length;j++)
                {
                    if(Level.getplayerchoice()[i] == Codemaker.getcodemake()[j])
                    {
                        System.out.println("You won");
                    }
                    else{
                        System.out.println("You wrong");
                    }
                }
            }
        }
}