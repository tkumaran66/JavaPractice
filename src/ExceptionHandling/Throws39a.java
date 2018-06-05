package ExceptionHandling;

public class Throws39a
{
    static void methodOne() throws NumberFormatException
    {
        int i = Integer.parseInt("abc");   //This statement throws NumberFormatException
    }
 
    static void methodTwo() throws NumberFormatException
    {
        methodOne();     //NumberFormatException is propagated here
    }
 
    static void methodThree() throws NumberFormatException
    {
        methodTwo();    //NumberFormatException is propagated here
    }
 
    public static void main(String[] args)
    {
        try
        {
            methodThree();
        }
        catch(NumberFormatException ex)
        {
            System.out.println("NumberFormatException will be caught here");
        }
    }
}