package Arrays;

class UserDefinedType07
{
    int i;
 
    void methodOne()
    {
        System.out.println("From User Defined Type Object");
    }
}
 
public class ArraysInJava07
{
    public static void main(String[] args)
    {
        UserDefinedType07[] arrayOfUserDefinedTypeObjects = new UserDefinedType07[10];
 
        for (int i = 0; i < arrayOfUserDefinedTypeObjects.length; i++)
        {
            //Creating an object of 'UserDefinedType07' and
            //assigning it to an element of array
 
            arrayOfUserDefinedTypeObjects[i] = new UserDefinedType07();
        }
 
        arrayOfUserDefinedTypeObjects[1].methodOne();   //accessing member of 'UserDefinedType07'
 
        //Now, above statement does not throw NullPointerException
    }
}