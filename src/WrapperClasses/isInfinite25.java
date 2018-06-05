package WrapperClasses;

public class isInfinite25
{
    public static void main(String[] args)
    {
        double d = Double.POSITIVE_INFINITY / 0.0;
 
        System.out.println(Double.isInfinite(d));    //Output : true
 
        d = Double.NEGATIVE_INFINITY / 0.0;
 
        System.out.println(Double.isInfinite(d));    //Output : true
 
        float f = Float.POSITIVE_INFINITY * 2.2f;
 
        System.out.println(Float.isInfinite(f));            //Output : true
 
        f = Float.NEGATIVE_INFINITY * 4.12f;
 
        System.out.println(Float.isInfinite(f));          //Output : true
    }
}
	