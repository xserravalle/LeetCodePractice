// LEETCODE PROBLEM 9 - PALINDROME NUMBER
// TRAVERSE AN ARRAY OF NUMBERS USING TWO-POINTER, DETERMINE IF THE ARRAY CONTAINS
// A PALINDROME, IN WHICH THE DIGITS READ THE SAME BACK TO FRONT

import java.util.Arrays;

public class LeetCode9 {
    public static boolean palindromeNumber(int[] numbers) {
        // ESTABLISH POINTERS
        int left = 0;
        int right = numbers.length - 1;

        // CONDITIONAL STATEMENT TO DETERMINE IF THE INTEGER VALUES AT LEFT INDEX AND RIGHT INDEX
        // ARE THE SAME. IF THEY ARE NOT, THE LOOP BREAKS IMMEDIATELY. IF THEY ARE, THE TRAVERSAL
        // CONTINUES
        while (left < right) {
            if (numbers[left] != numbers[right]) {
                return false;
            }
        // INDEXES INCREMENT AND DECREMENT RESPECTIVELY TO CONTINUE TRAVERSAL
        left++;
        right--;
    }
    return true;
}


    public static void main(String[] args) {
        int[] numbers1 = {1, 2, 3, 2, 1};
        int[] numbers2 = {2, 2, 2, 2, 3, 2};

        System.out.println("Is numbers1 a palindrome? -- " + palindromeNumber(numbers1));
        System.out.println("Is numbers2 a palindrome? -- " + palindromeNumber(numbers2));
    }
}
