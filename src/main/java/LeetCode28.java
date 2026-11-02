// LEETCODE 28 - FIND INDEX OF FIRST OCCURRENCE IN A STRING
// GIVEN TWO STRINGS needle AND haystack, RETURN THE INDEX OF THE FIRST OCCURRENCE OF needle IN haystack, OR -1
// IF needle IS NOT PART OF haystack

public class LeetCode28 {
    public int firstOccurrence(String needle, String haystack) {
        if (needle == null || haystack == null) {
            return -1;
        }

        int result = -1;
        boolean resultFound = false;

        char[] needleArray = needle.toCharArray();
        char[] haystackArray = haystack.toCharArray();

        int nLength = needleArray.length;
        int hLength = haystackArray.length;

        if (nLength > hLength) {
            return -1;
        }

        while (!resultFound) {
            for (int i = 0; i <= hLength - nLength; i++) {
                boolean match = true;

                for (int j = 0; j < nLength; j++) {
                    if (haystackArray[i + j] != needleArray[j]) {
                        match = false;
                        break;
                    }
                }

                if (match) {
                    result = i;
                    resultFound = true;
                    break;
                }
            }
            break;
        }
        return result;
    }

    public void main(String[] args) {
        String needle = "cat";
        String haystack = "concatenate";
        System.out.println("Testing string needle as cat vs. string haystack as concatenate");
        System.out.println(firstOccurrence(needle, haystack));

        String haystack2 = "fahrenheit";
        System.out.println("Testing string needle as cat vs. string haystack as fahrenheit");
        System.out.println(firstOccurrence(needle, haystack2));

        String needle2 = "";
        String haystack3 = "";
        System.out.println("Testing empty string needle vs empty string haystack");
        System.out.println(firstOccurrence(needle2, haystack3));

        String needle3 = "longword";
        String haystack4 = "cat";
        System.out.println("Testing string needle3 vs. haystack4 in which the length of haystack");
        System.out.println("is longer in length than needle");
        System.out.println(firstOccurrence(needle3, haystack4));

        System.out.println("Testing null string needle4 vs. cat");
        System.out.println(firstOccurrence(null, "cat"));
    }
}
