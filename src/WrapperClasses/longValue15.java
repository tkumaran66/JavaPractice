package WrapperClasses;

public class longValue15 {
	  public static void main(String[] args)
	    {
	        Byte B = new Byte("55");
	        long l = B.longValue();
	        System.out.println(l);      //Output : 55
	 
	        Short S = new Short("23");
	        l = S.longValue();
	        System.out.println(l);     //Output : 23
	 
	        Integer I = new Integer("56");
	        l = I.longValue();
	        System.out.println(l);    //Output : 56
	 
	        Long L = new Long("125");
	        l = L.longValue();
	        System.out.println(l);    //Output : 125
	 
	        Float F = new Float("23.56");
	        l = F.longValue();
	        System.out.println(l);    //Output : 23  (Value is truncated)
	 
	        Double D = new Double("521.56");
	        l = D.longValue();
	        System.out.println(l);   //Output : 521  (Value is truncated)
	    }
}
