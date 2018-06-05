package WrapperClasses;

public class intValue13 {
	 public static void main(String[] args)
	    {
	        Byte B = new Byte("55");
	        int i = B.intValue();
	        System.out.println(i);      //Output : 55
	 
	        Short S = new Short("23");
	        i = S.intValue();
	        System.out.println(i);     //Output : 23
	 
	        Integer I = new Integer("56");
	        i = I.intValue();
	        System.out.println(i);    //Output : 56
	 
	        Long L = new Long("125");
	        i = L.intValue();
	        System.out.println(i);    //Output : 125
	 
	        Float F = new Float("23.56");
	        i = F.intValue();
	        System.out.println(i);    //Output : 23  (Value is truncated)
	 
	        Double D = new Double("521.56");
	        i = D.intValue();
	        System.out.println(i);   //Output : 521  (Value is truncated)
	    }
}
