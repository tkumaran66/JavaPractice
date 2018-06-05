package ExceptionHandling;

public class ExceptionHandling03
{
    public static void main(String[] args)
    {
        System.out.println("This statement will be executed"); 
 
        int i = 1000/0;    //This statement throws ArithmaticException : / by zero
 
        System.out.println("This statement will not be executed");
    }
}
