package Arrays;

class A12
{
    int i;
}
 
public class ArraysInJava12
{
    public static void main(String[] args)
    {
        A12[] a = methodOne();     
 
        System.out.println(a[2].i);     //Output : 10
 
        System.out.println(a[5].i);     //Output : 20
    }
 
    //Method returns an array of A-type
 
    static A12[] methodOne()
    {
        //declaring and creating An array object of A-type containing 8 references to A-type objects
 
        A12[] a = new A12[8];   
 
        a[2] = new A12();   //creating A-type object and assigning it to element at index 2
 
        a[5] = new A12();   //creating A-type object and assigning it to element at index 5
 
        a[2].i = 10;   //Changing value of field of A-type object referred by element at index 2
 
        a[5].i = 20;   //Changing value of field of A-type object referred by element at index 5
 
        return a;
    }
}