class Solution {
    public int myAtoi(String s) {
        s = s.trim();
        if (s.isEmpty()) return 0;

        int i = 0;
        boolean negative = false;
        if (s.charAt(0) == '-' || s.charAt(0) == '+') {
            negative = (s.charAt(0) == '-');
            i++;
        }

        long result = 0; 
        while (i < s.length() && Character.isDigit(s.charAt(i))) {
            result = result * 10 + (s.charAt(i) - '0');

            if (result > Integer.MAX_VALUE) {
                return negative ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            }

            i++;
        }

        result = negative ? -result : result;

        return (int) result;
    }
}
