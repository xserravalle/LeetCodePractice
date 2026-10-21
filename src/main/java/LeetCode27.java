// LEETCODE 27 - REMOVE ELEMENT

// GIVEN AN INTEGER ARRAY AND INTEGER VAL, REMOVE ALL OCCURANCES OF VAL IN NUMS, IN-PLACE. ORDER OF THE ELEMENTS MAY BE CHANGED.
// THEN, RETURN THE NUMBER OF ELEMENTS IN NUMS WHICH ARE NOT EQUAL TO VAL.
// CONSIDER THE NUMBER OF ELEMENTS IN NUMS WHICH ARE NOT EQUAL VAL TO BE K.
// CHANGE THE ARRAY NUMS SUCH THAT THE FIRST K ELEMENTS OF NUMS CONTAIN ELEMENTS WHICH ARE NOT EQUAL TO VAL.

import java.util.Arrays;

public class LeetCode27 {
    public int removeElement(int[] nums, int val) {
        int index = 0;
        for (int i=0;i < nums.length; i++) {
            if (nums[i] != val) {
                nums[index] = nums[i];
                index++;
            }
        }
        return index;
    }

    public void main(String[] args) {
        int[] testNums = {1, 2, 2, 3, 2, 2, 4, 5, 5, 6};
        int testVal = 2;

        System.out.println("Integer values in testNums array:");
        for (int num : testNums) {
            System.out.println(num);
        }
        System.out.println("----------------------------------");
        System.out.println("Value to remove: " + testVal);
        System.out.println("----------------------------------");
        System.out.println("Instances of " + testVal + " removed: " + removeElement(testNums, testVal));
        System.out.println("----------------------------------");
        System.out.println("testNums array post-removal: ");
        for (int num : testNums) {
            System.out.println(num);
        }

    }
}
