package WrapperClasses;

public class doubleValue17 {
	  public static void main(String[] args)
	    {
	        Byte B = new Byte("55");
	        double d = B.doubleValue();
	        System.out.println(d);      //Output : 55.0
	 
	        Short S = new Short("23");
	        d = S.floatValue();
	        System.out.println(d);     //Output : 23.0
	 
	        Integer I = new Integer("56");
	        d = I.floatValue();
	        System.out.println(d);    //Output : 56.0
	 
	        Long L = new Long("125");
	        d = L.floatValue();
	        System.out.println(d);    //Output : 125.0
	 
	        Float F = new Float("23.56");
	        d = F.floatValue();
	        System.out.println(d);    //Output : 23.559999465942383
	 
	        Double D = new Double("521.56");
	        d = D.floatValue();
	        System.out.println(d);   //Output : 521.5599975585938
	    }
}
