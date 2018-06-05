package ExceptionHandling;

class SuperClass
{
    void methodOfSuperClass()
    {
        System.out.println("Super class method is not throwing any exceptions");
    }
}
 
class SubClass2 extends SuperClass
{
    @Override
    void methodOfSuperClass() throws ArrayIndexOutOfBoundsException
    {
        System.out.println("can be overrided with any unchecked Exception");
    }
}
 
class SubClassOne2 extends SuperClass
{
    @Override
    void methodOfSuperClass() throws NumberFormatException, NullPointerException, RuntimeException
    {
        System.out.println("Can be overrided with any number of Unchecked Exceptions");
    }
}
 
class SubClassTwo2 extends SuperClass
{
    @Override
    void methodOfSuperClass() throws SQLException
    {
        //Compile time error
        //Can not be overrided with checked exception
    }
}