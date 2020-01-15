import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UnitTest2Test
{
    @Test
    void testToString1()
    {
        UnitTest2 first = new UnitTest2(0, true);
        assertEquals("0 true", first.toString());
    }

    @Test
    void testToString2()
    {
        UnitTest2 second = new UnitTest2(-1, false);
        assertEquals("-1 false", second.toString());
    }

    @Test
    void testGetBooleanValue1()
    {
        UnitTest2 third = new UnitTest2(0, false);
        assertEquals(true, third.getBooleanValue());
    }

    @Test
    void testGetBooleanValue2()
    {
        UnitTest2 fourth = new UnitTest2(-1, true);
        assertEquals(false, fourth.getBooleanValue());
    }
}