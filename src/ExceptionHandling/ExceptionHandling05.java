package ExceptionHandling;

public class ExceptionHandling05
{
    public static void main(String[] args)
    {
        System.out.println("This statement will be executed"); 
 
        String s = args[0];    //This statement throws ArrayIndexOutOfBoundsException
 
        System.out.println("This statement will not be executed");
    }
}
