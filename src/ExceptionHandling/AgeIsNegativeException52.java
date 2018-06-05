package ExceptionHandling;

class AgeIsNegativeException52 extends Exception
{
    String errorMessage;
 
    public AgeIsNegativeException52(String errorMessage)
    {
        this.errorMessage = errorMessage;
    }
 
    //Modifying toString() method to display customized error message
 
    @Override
    public String toString()
    {
        return errorMessage;
    }
}