// LEETCODE PROBLEM 13 - ROMAN TO INTEGER
// ASSUMES STRING WILL ALWAYS BE IN CORRECT ROMAN NUMERAL FORMAT.
// CONVERT EACH STRING VALUE TO IT'S ASSOCIATED ROMAN NUMERAL VALUE.

public class LeetCode13 {
    private static int getValue(char c) {
        if (c == 'I') return 1;
        if (c == 'V') return 5;
        if (c == 'X') return 10;
        if (c == 'L') return 50;
        if (c == 'C') return 100;
        if (c == 'D') return 500;
        if (c == 'M') return 1000;
        return 0;
    }

    public static int romanToInt(String s) {
        int total = 0;

        for (int i = 0; i < s.length(); i++) {
            int currentVal = getValue(s.charAt(i));

            if (i < s.length() - 1 && currentVal < getValue(s.charAt(i+1))) {
                total -= currentVal;
            } else {
                total += currentVal;
            }
        }
        return total;
    }

    public static void main(String[] args) {
        System.out.println("XVI: " + romanToInt("XVI"));
        System.out.println("MCMXVII: " + romanToInt("MCMXVII"));
    }
}
