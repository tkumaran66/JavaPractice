package ExceptionHandling;

public class ExceptionHandling06
{
    public static void main(String[] args)
    {
        System.out.println("This statement will be executed"); 
 
        try
        {
            String s = args[1];    //This statement throws ArrayIndexOutOfBoundsException
        }
        catch (Exception e)
        {
            System.out.println("Exception Caught");
        }
 
        System.out.println("Now, This statement will also be executed");
    }
}