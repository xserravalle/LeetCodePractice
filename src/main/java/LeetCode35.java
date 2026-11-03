// LEETCODE 35 - SEARCH INSERT POSITION
// GIVEN A SORTED ARRAY OF DISTINCT INTEGERS AND A TARGET VALUE, RETURN THE INDEX IF THE TARGET IS FOUND. IF NOT,
// RETURN THE INDEX WHERE IT WOULD BE IF IT WERE INSERTED IN ORDER.

public class LeetCode35 {
    public int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;

        if (nums == null) {
            return -1;
        }

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid+1;
            } else {
                right = mid-1;
            }
        }
        return left;
    }

    public void main(String[] args) {
        int test[] = {0, 1, 2, 3};
        int testTarget = 2;
        System.out.println("Test array: ");
        for (int output : test) {
            System.out.println(output);
        }
        System.out.println("Test value: " + testTarget);
        searchInsert(test, testTarget);

        int test2[] = {0, 1, 2, 4};
        int testTarget2 = 3;
        System.out.println("Test array: ");
        for (int output : test2) {
            System.out.println(output);
        }
        System.out.println("Test value: " + testTarget2);
        searchInsert(test2, testTarget2);
    }
}
