package ExceptionHandling;

public class Return24 {
	public static void main(String[] args)
    {
        System.out.println(methodReturningValue());
    }
 
    static int methodReturningValue()
    {
        try
        {
            //This block may or may not return a value as finally block is returning a value
        }
        catch (Exception e)
        {
            //This block may or may not return a value as finally block is returning a value
        }
        finally
        {
            return 20;
        }
    }
}
