package ExceptionHandling;

public class Return32 {
	public static void main(String[] args)
    {
        System.out.println(methodReturningValue());
    }
 
    static int methodReturningValue()
    {
        try
        {
            int i = Integer.parseInt("123");
            return 20;
        }
        finally
        {
            return 50;
        }
    }
}
