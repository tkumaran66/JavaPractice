package ExceptionHandling;

public class Return33 {
 public static void main(String[] args)
    {
        System.out.println(methodReturningValue());
    }
 
    static int methodReturningValue()
    {
        try
        {
            int i = Integer.parseInt("abc");   //This statement throws NumberFormatException
            return 20;
        }
        finally
        {
            return 50;
        }
    }
}
