package WrapperClasses;
public abstract class Number12 {
	 //Four Abstract Methods
    public abstract int intValue();
    public abstract long longValue();
    public abstract float floatValue();
    public abstract double doubleValue();

    //Two Concrete Methods
    public byte byteValue()
    {
         return (byte)intValue();
    }

    public short shortValue()
    {
         return (short)intValue();
    }
}
