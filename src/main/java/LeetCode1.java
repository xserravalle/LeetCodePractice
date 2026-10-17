// LEETCODE PROBLEM 1 -- TWO SUM
// YOU ARE GIVEN AN ARRAY OF INTEGERS nums AND AN INTEGER target
// RETURN INDICES OF THE TWO NUMBERS SUCH THAT THEY ADD UP TO target

import java.util.HashMap;
import java.util.Map;

// BEST APPROACH - O(n)

public class LeetCode1 {
    public static int[] twoSum(int[] nums, int target) {
        // UTILIZE A HASHMAP
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            // SET REQUIRED NUMBER EQUAL TO TARGET VALUE - VALUE AT INDEX DURING TRAVERSAL
            int requiredNumber = target - nums[i];

            // IF THE MAP CONTAINS THE REQUIRED NUMBER, RETURN AN ARRAY WITH THE REQUIRED NUMBER VALUE AND
            // THE VALUE AT THE VALID INDEX
            if (map.containsKey(requiredNumber)) {
                return new int[]{map.get(requiredNumber), i};
            }
            map.put(nums[i], i);
        }

        return new int[] {};
    }

    public static void main(String[] args) {
        int[] nums = {2, 4, 6, 8, 9};
        int target = 14;

        int[] result = twoSum(nums, target);
        System.out.println("[" + result[0] + ", " + result[1] + "]");
    }
}
