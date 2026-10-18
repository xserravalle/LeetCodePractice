// LEETCODE 20 - VALID PARENTHESES
// GIVEN A STRING s INCLUDING ONLY CHARACTERS () [] {}, DETERMINE IF THE INPUT STRING IS VALID
// ALL VALID STRINGS INCLUDE PROPERLY CLOSED PARENTHESES/BRACKETS/BRACES

import java.util.ArrayDeque;
import java.util.Deque;

public class LeetCode20 {
    private static boolean validParentheses(String s) {
        if (s.length() % 2 != 0) { return false; };

        Deque<Character> stack = new ArrayDeque<>();

        for (int i=0; i<s.length();i++) {
            char c = s.charAt(i);

            if (c == '(') {
                stack.push(')');
            } else if (c == '{') {
                stack.push('}');
            } else if (c == '[') {
                stack.push(']');
            } else if (stack.isEmpty() || stack.pop() != c) {
                return false;
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String testString = "()";
        String testString2 = "(){}[]";
        String testString3 = "(]";
        String testString4 = "({})";

        System.out.println("Testing validity of testString: " + validParentheses(testString));
        System.out.println("Testing validity of testString2: " + validParentheses(testString2));
        System.out.println("Testing validity of testString3: " + validParentheses(testString3));
        System.out.println("Testing validity of testString4: " + validParentheses(testString4));
    }

}
