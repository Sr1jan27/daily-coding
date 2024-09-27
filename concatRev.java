public class concatRev {
    
class Solution {
    static String conRevstr(String S1, String S2) {
        // code here
        StringBuilder sb = new StringBuilder();
        sb.append(S1);
        sb.append(S2);
        sb.reverse();
        return sb.toString();
    }
}
}
