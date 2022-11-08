import static org.junit.Assert.*;
import org.junit.Test;

public class MissingNumberTest {
    private int[] missingMax = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
    private int[] missingNone = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
    private int[] missingSeven = { 1, 2, 3, 4, 5, 6, 8, 9, 10 };
    private MissingNumber number = new MissingNumber();



    // check for 7
    @Test
    public void testMissingNumber_MissingSeven() {
        assertEquals(7, number.missingNumber(missingSeven, 10));
    }


    // check for the missing max number, 10
    @Test
    public void testMissingNumber_MissingMax() {
        assertEquals(10, number.missingNumber(missingMax, 10));
    }


    // check that a number is actually missing
    @Test
    public void testMissingNumber_NoMissing() {
        assertEquals(0, number.missingNumber(missingNone, 10));
    }
}