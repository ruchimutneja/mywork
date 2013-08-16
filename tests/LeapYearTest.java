import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LeapYearTest {

    LeapYear leapYear = new LeapYear();

    @Test
    public void should_give_four_is_leap_year() throws Exception {
        assertEquals(true, leapYear.isLeapYear(4));
    }

    @Test
    public void should_give_five_is_not_leap_year() throws Exception {
        assertEquals(false, leapYear.isLeapYear(5));
    }

    @Test
    public void should_give_8_is_leap_year() throws Exception {
        assertEquals(true, leapYear.isLeapYear(8));
    }

    @Test
    public void should_give_100_is_not_leap_year() throws Exception {
        assertEquals(false, leapYear.isLeapYear(100));
    }

    @Test
    public void should_check_2000_is_leap_year() {
        assertEquals(true, leapYear.isLeapYear(2000));
    }

    @Test
    public void should_check_1999_is_not_leap_year() {
        assertEquals(false, leapYear.isLeapYear(1999));
    }
}
