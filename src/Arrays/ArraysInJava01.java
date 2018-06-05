package Arrays;

public class ArraysInJava01 {
	public static void main(String[] args)
    {
 
        char[] arrayOfChars;     //Declaring an array of characters
 
        boolean arrayOfBooleans[];   //Declaring an array of booleans
        
        arrayOfInts = new int[10];   //Instiantiating an array of int using new operator
        
        arrayOfInts[2] = 12;         //Initializing 3rd element
 
        arrayOfInts[5] = 56;         //Initializing 6th element
       
        //Declaring, instantiating and Initializing an array in one statement
        
        double[] arrayOfDoubles = new double[] {12.56, 45.87, 14.85};
 
        //This is also ok. 
 
        int[] arrayOfInts2 = {12, 21, 0, 5, 7};
      
        //Declaring and Initializing an array in one statement
        
        int[] arrayOfInts3 = {12, 21, 0, 5, 7};  
 
        System.out.println(arrayOfInts[0]);   //accessing 1st element
 
        System.out.println(arrayOfInts[3]);   //accessing 4th element
 
        System.out.println(arrayOfInts[2]);   //accessing 3rd element
    }
}
