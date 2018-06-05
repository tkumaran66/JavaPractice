package WrapperClasses;

public class ParsingMethods07 {
	public static void main(String[] args)
    {
        byte b = Byte.parseByte("10");
        System.out.println(b);               //Output : 10
 
        short s = Short.parseShort("25");
        System.out.println(s);              //Output : 25
 
        int i = Integer.parseInt("123");
        System.out.println(i);              //Output : 123
 
        long l = Long.parseLong("100");
        System.out.println(l);             //Output : 100
 
        float f = Float.parseFloat("12.35");
        System.out.println(f);            //Output : 12.35
 
        double d = Double.parseDouble("12.87");
        System.out.println(d);            //Output : 12.87
 
        boolean bln = Boolean.parseBoolean("true");
        System.out.println(bln);                   //Output : true
 
        boolean bln1 = Boolean.parseBoolean("abc");
        System.out.println(bln1);                 //Output : false
 
        char c = Character.parseChar("abc");     //compile time error
 
        //parseChar() is not defined for Character wrapper class
    }
}
