package ExceptionHandling;

public class Final59 {
	public static void main(String[] args) 
    {
        try
        {
            Integer I = new Integer("abc");    //throws NumberFormatException
        } 
        catch (NumberFormatException e)
        {
            System.out.println(e.getMessage());     //Output ---> For input string: "abc"
             
            System.out.println(e.toString());       //Output ---> java.lang.NumberFormatException: For input string: "abc"
             
            e.printStackTrace();        
             
            //Output ---->
            //java.lang.NumberFormatException: For input string: "abc"
            //at java.lang.NumberFormatException.forInputString(Unknown Source)
            //at java.lang.Integer.parseInt(Unknown Source)
            //at java.lang.Integer.<init>(Unknown Source)
            //at pack1.Test.main(Test.java:9)
             
            System.out.println(e);      //Output ---> java.lang.NumberFormatException: For input string: "abc"
        }
    }
}
