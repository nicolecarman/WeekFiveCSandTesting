import java.util.HashMap;
import java.util.Stack;

public class BalancedBrackets {
    // PROJECT PART 2: DATA STRUCTURES
    // Write a function that takes in a string and returns true or false depending on whether that string has balanced parentheses.
    // A string has balanced parentheses if every opening parenthesis “(“ has a matching closing parenthesis “)”

    // For the purposes of this problem, you only need to worry about parentheses “(“ and “)”,
    // not other opening-and-closing marks, like curly brackets, square brackets, or angle brackets.
    public static boolean balancedParentheses(String s) {
        int unclosedParentheses = 0;

        for (int i = 0; i < s.length(); i += 1) {
            if (s.charAt(i) == '(') {

                unclosedParentheses += 1;

            } else if (s.charAt(i) == ')') {

                unclosedParentheses -= 1;

            }

            if (unclosedParentheses < 0) {

                return false;

            }
        }

        return unclosedParentheses == 0;
    }





    // Write a function that takes in a string and returns true or false based on whether the string’s
    // opening-and-closing marks (that is, brackets) are balanced.
    public static boolean balancedBrackets(String s) {

        Stack<Character> stack = new Stack<Character>();

        HashMap<Character, Character> bracketPairs = new HashMap<Character, Character>();
        bracketPairs.put(')', '(');
        bracketPairs.put(']', '[');
        bracketPairs.put('}', '{');
        bracketPairs.put('>', '<');

        for (int i = 0; i < s.length(); i += 1) {

            // If character is opening bracket
            if (bracketPairs.containsValue(s.charAt(i))) {
                stack.push(s.charAt(i));
            }

            // Else, if character is closing bracket
            else if (bracketPairs.containsKey(s.charAt(i))) {

                // Closing bracket without matching opening bracket
                if (stack.isEmpty()) {

                    return false;
                }

                // Check that most recent bracket on stack matches
                Character lastBracket = stack.pop();

                if (!lastBracket.equals(bracketPairs.get(s.charAt(i)))) {

                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
}
