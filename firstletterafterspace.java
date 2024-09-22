class Solution {
    String firstAlphabet(String S) {
        // code here
        StringBuilder s = new StringBuilder();
        s.append(S.charAt(0));
        for(int i=1;i<S.length();i++){
            if(S.charAt(i-1)==' ') {
                s.append(S.charAt(i));
            }
        }
        return s.toString();
    }
};