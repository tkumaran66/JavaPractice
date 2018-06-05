package ExceptionHandling;

public class ExceptionHandling07
{
    public static void main(String[] args)
    {
        System.out.println("This statement will be executed"); 
 
        Object o = new Object();
 
        ExceptionHandling07 e = (ExceptionHandling07) o;   //This statement throws ClassCastException
 
        System.out.println("This statement will not be executed");
    }
}
