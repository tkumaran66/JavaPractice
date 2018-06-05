package WrapperClasses;

public class floatValue16 {
    public static void main(String[] args)
    {
        Byte B = new Byte("55");
        float f = B.floatValue();
        System.out.println(f);      //Output : 55.0
 
        Short S = new Short("23");
        f = S.floatValue();
        System.out.println(f);     //Output : 23.0
 
        Integer I = new Integer("56");
        f = I.floatValue();
        System.out.println(f);    //Output : 56.0
 
        Long L = new Long("125");
        f = L.floatValue();
        System.out.println(f);    //Output : 125.0
 
        Float F = new Float("23.56");
        f = F.floatValue();
        System.out.println(f);    //Output : 23.56
 
        Double D = new Double("521.56");
        f = D.floatValue();
        System.out.println(f);   //Output : 521.56
    }
}
