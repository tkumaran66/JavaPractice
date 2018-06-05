package ExceptionHandling;

public class UncheckedException50
{
    public static void main(String[] args)
    {
        try
        {
            int i = Integer.parseInt("Unchecked Exception");   
 
            //Above statement throws NumberFormatException which is an unchecked exception
        }
        catch (NumberFormatException e)
        {
            System.out.println("NumberFormatException will be caught here");
        }
    }
}