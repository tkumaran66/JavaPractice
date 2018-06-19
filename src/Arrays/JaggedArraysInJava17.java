package Arrays;

public class JaggedArraysInJava17
{
    public static void main(String[] args)
    {
        //Jagged Two Dimensional Array, No need to mention the size of it's contained arrays
        int[][] jaggedTwoDimensionalArray = new int[5][];
 
        //One Dimensional Array of lenghth 3
        int[] OneDimensionalArray1 = {1, 2, 3};
 
        //One Dimensional Array of lenghth 4
        int[] oneDimensionalArray2 = {4, 5, 6, 7};
 
        //One Dimensional Array of lenghth 5
        int[] oneDimensionalArray3 = {8, 9, 10, 11, 12};
 
        //Initializing elements of Jagged Array
 
        jaggedTwoDimensionalArray[0] = OneDimensionalArray1;
 
        jaggedTwoDimensionalArray[1] = oneDimensionalArray2;
 
        jaggedTwoDimensionalArray[2] = oneDimensionalArray3;
    }
}