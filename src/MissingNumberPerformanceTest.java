import static org.junit.Assert.*;
import org.junit.Test;

public class MissingNumberPerformanceTest {

    private int[] missingMax = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
    private int[] missingNone = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
    private int[] missingSeven = { 1, 2, 3, 4, 5, 6, 8, 9, 10 };
    private int max = 10;
    private MissingNumber number = new MissingNumber();



    @Test(timeout=100)
    public void testMissingNumber_Performance() {
        for (int i = 0; i < 1000000; i += 1) {
            number.missingNumber(missingMax, max);
            number.missingNumber(missingNone, max);
            number.missingNumber(missingSeven, max);
        }
    }



    @Test(timeout=100)
    public void testMissingNumberSort_Performance() {
        for (int i = 0; i < 1000000; i += 1) {
            number.missingNumberSort(missingMax, max);
            number.missingNumberSort(missingNone, max);
            number.missingNumberSort(missingSeven, max);
        }
    }



    @Test(timeout=100)
    public void testMissingNumberSum_Performance() {
        for (int i = 0; i < 1000000; i += 1) {
            number.missingNumberSum(missingMax, max);
            number.missingNumberSum(missingNone, max);
            number.missingNumberSum(missingSeven, max);
        }
    }
}