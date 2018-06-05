package WrapperClasses;

public class isNaN24
{
    public static void main(String[] args)
    {
        double d = 0.0/0.0;
 
        System.out.println(Double.isNaN(d));    //Output : true
 
        d = Math.sqrt(-1.2);
 
        System.out.println(Double.isNaN(d));    //Output : true
 
        float f = 0.0f/0.0f;
 
        System.out.println(Float.isNaN(f));            //Output : true
 
        f = 0 * Float.POSITIVE_INFINITY;
 
        System.out.println(Float.isNaN(f));          //Output : true
    }
}