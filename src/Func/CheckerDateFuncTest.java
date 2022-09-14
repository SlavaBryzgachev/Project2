package Func;

import org.junit.Test;

import static org.junit.Assert.*;

public class CheckerDateFuncTest {

    @Test
    public void isLeap() {
        int year = 2012;
        assertTrue(CheckerDateFunc.isLeap(year));
    }

    @Test
    public void calcCountDays() {
        int m = 3;
        int y = 2010;
        int expected = 31;

        int actual = CheckerDateFunc.calcCountDays(m, y);

        assertEquals(expected, actual);
    }

    @Test
    public void checkDate() {
        int m = 4;
        int y = 2010;
        int d = 31;

        assertFalse(CheckerDateFunc.checkDate(d, m, y));
    }
}