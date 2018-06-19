package Arrays;
class UserDefinedType
{
    int i;
 
    void methodOne()
    {
        System.out.println("From User Defined Type Object");
    }
}
 
public class ArraysInJava06
{
    public static void main(String[] args)
    {
        UserDefinedType[] arrayOfUserDefinedTypeObjects = new UserDefinedType[10];
 
        arrayOfUserDefinedTypeObjects[1].methodOne();    //This statement throws NullPointerException
 
        //because array elements are not initialized
    }
}