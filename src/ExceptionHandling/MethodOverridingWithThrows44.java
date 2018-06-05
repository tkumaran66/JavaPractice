package ExceptionHandling;

class MethodOverridingWithThrows44
{
    void methodOfSuperClass() throws IOException
    {
        System.out.println("Super class method is throwing checked exception");
    }
}
 
class SubClass extends MethodOverridingWithThrows44
{
    @Override
    void methodOfSuperClass() throws IOException
    {
        System.out.println("Can be Overrided with same checked exception");
    }
}
 
class SubClassOne extends MethodOverridingWithThrows44
{
    @Override
    void methodOfSuperClass() throws FileNotFoundException
    {
        System.out.println("Can be overrided with checked Exception with lesser scope");
    }
}
 
class SubClassTwo extends MethodOverridingWithThrows44
{
    @Override
    void methodOfSuperClass() throws NullPointerException, ArrayIndexOutOfBoundsException, FileNotFoundException
    {
        System.out.println("Can be overrided with any unchecked exceptions and checked exception with lesser scope");
    }
}
 
class SubClassThree extends MethodOverridingWithThrows44
{
    @Override
    void methodOfSuperClass() throws Exception
    {
        //Compile time error
        //Can not be overrided with checked exception with higher scope
    }
}