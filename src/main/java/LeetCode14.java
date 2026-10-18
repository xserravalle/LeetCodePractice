// LEETCODE PROBLEM 14 - LONGEST COMMON PREFIX
// WRITE A FUNCTION TO FIND THE LONGEST COMMON PREFIX STRING AMONGST AN ARRAY OF STRINGS.
// IF THERE IS NO COMMON PREFIX, RETURN AN EMPTY STRING

public class LeetCode14 {
    private static String commonPrefix(String[] strings) {
        if (strings == null || strings.length == 0) return "";

        StringBuilder prefix = new StringBuilder();

        for (int i = 0; i < strings[0].length(); i++) {
            char c = strings[0].charAt(i);

            for (int j = 0; j < strings.length; j++) {
                if (i >= strings[j].length() || strings[j].charAt(i) != c) {
                    return prefix.toString();
                }
            }
            prefix.append(c);
        }
        return prefix.toString();
    }

    public static void main(String[] args) {
        String testStrings[] = {"dogbowl", "dogbone", "dogwater"};
        String testStrings2[] = {"bravo", "cat", "catman"};
        String testStrings3[] = {"prose", "prowl", "professional", "promotional"};

        System.out.println("Common prefix in testStrings [dogbowl, dogbone, dogwater]: "  + commonPrefix(testStrings));
        System.out.println("Common prefix in testStrings2 [bravo, cat, catman]: " + commonPrefix(testStrings2));
        System.out.println("Common prefix in testStrings3 [prose, prowl, professional, promotional]: " + commonPrefix(testStrings3));
    }
}
