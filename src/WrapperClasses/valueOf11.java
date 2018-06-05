package WrapperClasses;

public class valueOf11 {
	public static void main(String[] args)
    {
        Byte B = Byte.valueOf("1012", 2);
 
        //NumberFormatException : Because, Number with base 2 must contain only 0 and 1.
 
        B = Byte.valueOf("12043", 5);
 
        //NumberFormatException : Value is out of range for Byte Type.
 
        Short S = Short.valueOf("12043", 5);  //No Run time error : value is within the range of Short
        System.out.println(S);                //Output : 898
 
        Integer I = Integer.valueOf("1891BGH", 16);
 
        //NumberFormatException : Because, Number with base 16 must contain any digits from 0 to 9
        //and any character in A, B, C, D, E and F.
 
        Long L = Long.valueOf("GHJBDFR", 36);
 
        //No Run Time error : A number with base 36 can contain any digits and any alphabets from A to Z
        System.out.println(L);     //Output : 35888885703
    }
}
