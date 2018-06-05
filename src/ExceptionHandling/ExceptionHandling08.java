package ExceptionHandling;

public class ExceptionHandling08
{
    public static void main(String[] args)
    {
        System.out.println("This statement will be executed"); 
 
        Object o = new Object();
 
        try
        {
            ExceptionHandling08 e = (ExceptionHandling08) o;   //This statement throws ClassCastException
        }
        catch (Exception e)
        {
            System.out.println("Exception Caught");
        }
 
        System.out.println("Now, This statement will also be executed");
    }
}
