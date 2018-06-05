package ExceptionHandling;

class A
{
    int i;
 
    public A(String s) throws NumberFormatException
    {
        i = Integer.parseInt(s);    //This statement throws NumberFormatException
    }
}
 
public class Throws40
{
    public static void main(String[] args)
    {
        try
        {
            A a = new A("abc");    //Object creation statement enclosed in try-catch block
        }
        catch (NumberFormatException ex)
        {
            System.out.println("NumberFormatException will be caught here");
        }
    }
}