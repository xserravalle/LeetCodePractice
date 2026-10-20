// LEETCODE 26 - REMOVE DUPLICATES FROM SORTED ARRAY

// GIVEN AN INTEGER ARRAY nums SORTED IN NON-DECREASING ORDER, REMOVE DUPLICATES IN PLACE SUCH THAT EACH UNIQUE ELEMENT APPEARS ONLY ONCE. THE RELATIVE
// ORDER OF THE ELEMENTS SHOULD BE KEPT THE SAME.

// CONSIDER THE NUMBER OF UNIQUE ELEMENTS IN NUMS TO BE k. AFTER REMOVING THE DUPLICATES, RETURN THE NUMBER OF UNIQUE ELEMENTS k.

// THE FIRST k ELEMENTS OF nums SHOULD CONTAIN THE UNIQUE NUMBERS IN SORTED ORDER. THE REMAINING ELEMENTS BEYOND INDEX k-1 CAN BE IGNORED.

// NOTE -- MY ORIGINAL APPROACH ON THIS WAS TO EVALUATE WHETHER THE VALUES AT i AND i+1 WERE THE SAME, AND TO RECURSIVELY CALL removeDuplicates
// AND INCREASE THE INDEX. THIS CAUSED A StackOverflowError AND CRASHED. IT WAS ALSO POOR TIME COMPLEXITY. IN THE ITERATION BELOW, I INITIALLY
// BALKED AT THE IDEA OF insertIndex HAVING A VALUE OF 1 UNTIL I REVIEWED THE CODE AND SAW THAT AS OPPOSED TO BEGINNING AT INDEX [0] IN MY FIRST
// APPROACH, THE INDEX POINTS TO THE VALUE AT 1, AND ONLY OVERWRITES IF THE VALUES ARE UNIQUE, AND THEN INCREMENTS insertIndex TO PROGRESS THROUGH
// THE REST OF THE ARRAY. SO, I UNDERSTAND THIS APPROACH BETTER AS A RESULT OF THAT REVIEW. STILL HATE LEETCODE!

public class LeetCode26 {
    public int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int insertIndex = 1;

        for (int i = 0; i <= nums.length-1; i++) {
            if (nums[i] != nums[insertIndex-1]) {
                nums[insertIndex] = nums[i];
                insertIndex++;
            }
        }
        return insertIndex;
    }

    public void main(String[] args) {
        int numsTest[] = {0, 0, 1, 2, 2, 3, 4, 5, 6, 6};
        System.out.println("The number of unique numbers in numsTest is: " + removeDuplicates(numsTest));
    }

}
