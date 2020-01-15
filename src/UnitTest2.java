public class UnitTest2
{
    private int num;
    private boolean bool;

    public UnitTest2(int Num, boolean Bool)
    {
        num = Num;
        bool = Bool;
    }

    public boolean getBooleanValue()
    {
        if (num >= 0)
        {
            bool = true;
            return bool;
        }
        bool = false;
        return bool;
    }

    @Override
    public String toString()
    {
        return "" + num + " " + bool;
    }
}