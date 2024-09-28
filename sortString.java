public class sortString {
    class Solution 
{ 
    String sort(String s) 
    {
        // code here
        
        char[] c = new char[s.length()];
        c = s.toCharArray();
        Arrays.sort(c);
        StringBuilder sb = new StringBuilder();
        for(char ch:c){
            sb.append(ch);
        }
        
        return sb.toString();
    }
} 
}
