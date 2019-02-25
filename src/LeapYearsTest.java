import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeapYearsTest {

    private final LeapYears leapyears = new LeapYears();

    @Test
    void testOne() {
        assertEquals("It is not a leap year", leapyears.year(2019));
    }

    @Test
    void testTwo() {
        assertEquals("It is a leap year", leapyears.year(2020));
    }

}