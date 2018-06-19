package Arrays;

public class ArraysInJava11
{
    public static void main(String[] args)
    {
        int[] a = methodOne();     
 
        System.out.println(a[2]);     //Output : 10
 
        System.out.println(a[5]);     //Output : 20
    }
 
    //Method returns an array of int type
 
    static int[] methodOne()
    {
        //declaring and creating An array object of int type containing 8 elements
 
        int[] a = new int[8];   
 
        a[2] = 10;   //Changing value of element at index 2
 
        a[5] = 20;   //Changing value of element at index 5
 
        return a;
    }
}