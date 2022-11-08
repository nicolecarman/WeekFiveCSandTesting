import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.Set;

public class MissingNumber {
    // PROJECT PART 1: RUNTIME
    // Write a function that takes this list of numbers, as well as the maxNumber, and it should return the missing number.
    // For example, given a list of numbers, in random order, of 1...10, 8 was removed.

    public static int missingNumber(int[] numbers, int maxNumber) {

        Set<Integer> set = Arrays.stream(numbers).boxed().collect(Collectors.toSet());

        // If our list and maxNumber of 10 was passed into the function, it would return 8: missingNumber({2, 1, 4, 3, 6, 5, 7, 10, 9}, 10) ⇒ 8
        for (int i = 1; i <= maxNumber; i += 1) {
            if (!set.contains(i)) {
                return i;
            }
        }

        // If there is no missing number, the function should return 0.
        return 0;
    }
}