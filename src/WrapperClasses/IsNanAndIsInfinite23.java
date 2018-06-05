package WrapperClasses;

public class IsNanAndIsInfinite23
{
    public static void main(String[] args)
    {
        //Assigning Not-A-Number value of type double to d1
        double d1 = Double.NaN;
 
        System.out.println(d1);            //Output : NaN
 
        //Assigning positive infinity value of type double to d2
        double d2 = Double.POSITIVE_INFINITY;
 
        System.out.println(d2);           //Output : Infinity
 
        //Assigning negative infinity value of type double to d3
        double d3 = Double.NEGATIVE_INFINITY;
 
        System.out.println(d3);           //Output : -Infinity
 
        //Assigning Not-A-Number value of type float to f1
        float f1 = Float.NaN;
 
        System.out.println(f1);         //Output : NaN
 
        //Assigning positive infinity value of type float to f2
        float f2 = Float.POSITIVE_INFINITY;
 
        System.out.println(f2);        //Output : Infinity
 
        //Assigning negative infinity value of type float to f3
        float f3 = Float.NEGATIVE_INFINITY;
 
        System.out.println(f3);       //Output : -Infinity
    }
}