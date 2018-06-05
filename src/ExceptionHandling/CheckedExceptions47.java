package ExceptionHandling;

public class CheckedExceptions47
{
	 public static void main(String[] args)
	    {
	        try
	        {
	            Class.forName("AnyClassName");
	        }
	        catch (ClassNotFoundException ex)
	        {
	            System.out.println("ClassNotFoundException will be caught here");
	        }
	    }
}