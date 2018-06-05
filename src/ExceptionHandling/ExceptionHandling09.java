package ExceptionHandling;

public class ExceptionHandling09
{
    public static void main(String[] args)
    {
        System.out.println("This statement will be executed"); 
 
        String s = null;
 
        System.out.println(s.length());  //This statement throws NullPointerException
 
        System.out.println("This statement will not be executed");
    }
}