package Arrays;

public class MultiDimensionalArraysInJava15
{
    public static void main(String[] args)
    {
        //One Dimensional Arrays
        int[] fisrtArray = {1, 2, 3};      
 
        int[] secondArray = {4, 5, 6};    
 
        int[] thirdArray = {7, 8, 9};    
 
        int[] fourthArray = {10, 11, 12};    
 
        int[] fifthArray = {13, 14, 15};    
 
        int[] sixthArray = {16, 17, 18};    
 
        int[] seventhArray = {19, 20, 21};    
 
        int[] eighthArray = {22, 23, 24};    
 
        int[] ninthArray = {25, 26, 27};
 
        int[] tenthArray = {28, 29, 30};
 
        int[] eleventhArray = {31, 32, 33};
 
        int[] twelvethArray = {34, 35, 36};
 
        int[] thirteenthArray = {37, 38, 39};
 
        int[] fourteenththArray = {40, 41, 42};
 
        int[] fifteenthArray = {43, 44, 45};
 
        int[] sixteenthArray = {46, 47, 48};
 
        int[] seventeenthArray = {49, 50, 51};
 
        int[] eighteenthArray = {52, 53, 54};
 
        int[] ninteenthArray = {55, 56, 57};
 
        int[] twentiethArray = {58, 59, 60};
 
        int[] twentyFirstArray = {61, 62, 63};
 
        int[] twentySecondArray = {64, 65, 66};
 
        int[] twentyThirdArray = {67, 68, 69};
 
        int[] twentyFourthArray = {70, 71, 72};
 
        int[] twentyFifthArray = {73, 74, 75};
 
        int[] twentySixthArray = {76, 77, 78};
 
        int[] twentySeventhArray = {79, 80, 81};
 
        //Two Dimensional Arrays
        int[][] twoDimensionalArray1 = {fisrtArray, secondArray, thirdArray}; 
 
        int[][] twoDimensionalArray2 = {fourthArray, fifthArray, sixthArray};
 
        int[][] twoDimensionalArray3 = {seventhArray, eighthArray, ninthArray};
 
        int[][] twodimentionalArray4 = {tenthArray, eleventhArray, twelvethArray};
 
        int[][] twodimentionalArray5 = {thirteenthArray, fourteenththArray, fifteenthArray};
 
        int[][] twoDimentionalArray6 = {sixteenthArray, seventeenthArray, eighteenthArray};
 
        int[][] twoDimentionalArray7 = {ninteenthArray, twentiethArray, twentyFirstArray};
 
        int[][] twoDimentionalArray8 = {twentySecondArray, twentyThirdArray, twentyFourthArray};
 
        int[][] twoDimentionalArray9 = {twentyFifthArray, twentySixthArray, twentySeventhArray};
 
        //Three Dimensional Array
        int[][][] threeDimensionalArray1 = {twoDimensionalArray1, twoDimensionalArray2, twoDimensionalArray3};
 
        int[][][] threeDimentionalArray2 = {twodimentionalArray4, twodimentionalArray5, twoDimentionalArray6};
 
        int[][][] threeDimensionalArray3 = {twoDimentionalArray7, twoDimentionalArray8, twoDimentionalArray9};
 
        //Four Dimensional Array
        int[][][][] fourthDimentionalArray = {threeDimensionalArray1, threeDimentionalArray2, threeDimensionalArray3};
 
        //Printing elements of four dimensional array
        for (int i = 0; i < fourthDimentionalArray.length; i++)
        {
            System.out.print("{");
            for (int j = 0; j < fourthDimentionalArray[i].length; j++)
            {
                System.out.print("{");
                for (int k = 0; k < fourthDimentionalArray[i][j].length; k++)
                {
                    System.out.print("{");
                    for (int m = 0; m < fourthDimentionalArray[i][j][k].length; m++)
                    {
                        System.out.print(fourthDimentionalArray[i][j][k][m] +"\t");
                    }
                    System.out.print("} ");
                }
                System.out.print("} ");
            }
            System.out.print("}");
            System.out.println();
        }
    }
}