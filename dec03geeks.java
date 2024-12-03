  public static int minChar(String s) {
        int n = s.length();
        String rev_s = new StringBuilder(s).reverse().toString();
        String combined = s + "#" + rev_s;

        // Compute the LPS array for the combined string
        int[] lps = computeLPS(combined);

        // Minimum characters to add = n - length of the longest palindromic suffix
        return n - lps[combined.length() - 1];
    }

    private static int[] computeLPS(String str) {
        int n = str.length();
        int[] lps = new int[n];
        int len = 0; // Length of the previous longest prefix suffix
        int i = 1;

        while (i < n) {
            if (str.charAt(i) == str.charAt(len)) {
                len++;
                lps[i] = len;
                i++;
            } else {
                if (len != 0) {
                    len = lps[len - 1];
                } else {
                    lps[i] = 0;
                    i++;
                }
            }
        }

        return lps;
    }
