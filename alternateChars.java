public class alternateChars {
    class Solution {
        static String delAlternate(String S) {
            // code here
            StringBuilder sb = new StringBuilder();
            sb.append(S.charAt(0));
            for(int i=1;i<S.length();i++){
                if(i%2==0) sb.append(S.charAt(i));
            }
            
            return sb.toString();
        }
    }
}
