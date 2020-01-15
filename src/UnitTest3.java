public class UnitTest3
{
    private String str;
    private boolean bool;

    public UnitTest3(String Str)
    {
        str = Str;
    }

    public boolean isStringLowerCase()
    {
        if (str.equals(str.toLowerCase()))
        {
            bool = true;
        }
        else
        {
            bool = false;
        }
        return bool;
    }

    public String toString()
    {
        return str;
    }
}