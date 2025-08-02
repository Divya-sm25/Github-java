class Solution {
    public int myAtoi(String s) {
        // Step 1: Ignore leading whitespaces
        s = s.trim();
        if (s.length() == 0) return 0;

        int i = 0, sign = 1, result = 0;
        int n = s.length();

        // Step 2: Check the sign
        if (s.charAt(i) == '+' || s.charAt(i) == '-') {
            sign = (s.charAt(i) == '-') ? -1 : 1;
            i++;
        }

        // Step 3: Convert digits to integer
        while (i < n && Character.isDigit(s.charAt(i))) {
            int digit = s.charAt(i) - '0';

            // Step 4: Handle overflow
            if (result > (Integer.MAX_VALUE - digit) / 10) {
                return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }

            result = result * 10 + digit;
            i++;
        }

        return result * sign;
    }
}
