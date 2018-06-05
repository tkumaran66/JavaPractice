package ExceptionHandling;

class MethodOverridingWithThrows43
{
    void methodOfSuperClass() throws ArrayIndexOutOfBoundsException
    {
        System.out.println("Super class method is throwing Unchecked exception");
    }
}
 
class SubClass1 extends MethodOverridingWithThrows43
{
    @Override
    void methodOfSuperClass() throws ArrayIndexOutOfBoundsException
    {
        System.out.println("Can be Overrided with same unchecked exception");
    }
}
 
class SubClassOne1 extends MethodOverridingWithThrows43
{
    @Override
    void methodOfSuperClass() throws NumberFormatException, NullPointerException, RuntimeException
    {
        System.out.println("Can be overrided with any other Unchecked Exceptions");
    }
}
 
class SubClassTwo1 extends MethodOverridingWithThrows43
{
    @Override
    void methodOfSuperClass() throws IOException
    {
        //Compile time error
        //Can not be overrided with checked exception
    }
}