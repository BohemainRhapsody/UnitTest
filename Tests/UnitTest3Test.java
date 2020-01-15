import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UnitTest3Test
{

    @Test
    void testToString()
    {
        UnitTest3 first = new UnitTest3("Hello");
        assertEquals("Hello", first.toString());
    }

    @Test
    void testToString2()
    {
        UnitTest3 second = new UnitTest3("ice cream");
        assertEquals("ice cream", second.toString());
    }

    @Test
    void testIsStringLowerCase()
    {
        UnitTest3 third = new UnitTest3("Hello");
        assertEquals(false, third.isStringLowerCase());
    }

    @Test
    void testIsStringLowerCase2()
    {
        UnitTest3 fourth = new UnitTest3("ice cream");
        assertEquals(true, fourth.isStringLowerCase());
    }
}