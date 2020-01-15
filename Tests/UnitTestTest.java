import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UnitTestTest
{
    @Test
    void testToString1()
    {
        UnitTest first = new UnitTest("Hello World");
        assertEquals("Hello World", first.toString());
    }

    @Test
    void testToString2()
    {
        UnitTest second = new UnitTest(null);
        assertEquals(null, second.toString());
    }

    @Test
    void testToString3()
    {
        UnitTest third = new UnitTest("0123456789");
        assertEquals("0123456789", third.toString());
    }

    @Test
    void testToString4()
    {
        UnitTest fourth = new UnitTest("");
        assertEquals("", fourth.toString());
    }
}