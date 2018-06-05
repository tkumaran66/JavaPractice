package ExceptionHandling;

public class NestedTryCatchBlocks23 {
	public static void main(String[] args)
    {
        try
        {
            nestedTry();
        }
        catch(Exception ex)
        {
            System.out.println("NumberFormatException will be caught here");
        }
    }
 
    static void nestedTry()
    {
        try
        {
            int i = Integer.parseInt("abc");    //This statement throws NumberFormatException
        }
        catch(NullPointerException ex)
        {
            System.out.println("NumberFormatException will not be caught here");
        }
    }
}
