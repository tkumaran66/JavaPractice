package WrapperClasses;

public class valueOf09 {
	public static void main(String[] args)
    {
        Byte B = Byte.valueOf("123");
        System.out.println(B);              //Output : 123
 
        Short S = Short.valueOf("25");
        System.out.println(S);             //Output : 25
 
        Integer I = Integer.valueOf("46");
        System.out.println(I);            //Output : 46
 
        Long L = Long.valueOf("235");
        System.out.println(L);            //Output : 235
 
        Float F = Float.valueOf("23.5");
        System.out.println(F);           //Output : 23.5
 
        Double D = Double.valueOf("15.4");
        System.out.println(D);           //Output : 15.4
 
        Boolean BLN = Boolean.valueOf("true");
        System.out.println(BLN);        //Output : true
 
        BLN = Boolean.valueOf("false");
        System.out.println(BLN);        //Output : false
 
        BLN = Boolean.valueOf("abc");
        System.out.println(BLN);       //Output : false
 
        //Character C = Character.valueOf("C");    //Compile Time Error : Character Class doesn't have this method
    }
}
