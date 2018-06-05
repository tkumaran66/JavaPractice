package WrapperClasses;

public class shortValue14 {
    public static void main(String[] args)
    {
        Byte B = new Byte("55");
        short s = B.shortValue();
        System.out.println(s);      //Output : 55
 
        Short S = new Short("23");
        s = S.shortValue();
        System.out.println(s);     //Output : 23
 
        Integer I = new Integer("56");
        s = I.shortValue();
        System.out.println(s);    //Output : 56
 
        Long L = new Long("125");
        s = L.shortValue();
        System.out.println(s);    //Output : 125
 
        Float F = new Float("23.56");
        s = F.shortValue();
        System.out.println(s);    //Output : 23     (value is truncated)
 
        Double D = new Double("521.56");
        s = D.shortValue();
        System.out.println(s);   //Output : 521         (value is truncated)
    }
}
