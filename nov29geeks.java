class Solution {
    public String addBinary(String s1, String s2) {
        // code here
        
        int i = s1.length()-1;
        int j = s2.length()-1;
        int carry  =0;
        StringBuilder sb = new StringBuilder();
        while(i>=0 || j>=0 || carry ==1){
            int currSum = carry;
            currSum+= i>=0 ? s1.charAt(i)-'0':0;
            currSum+= j>=0 ? s2.charAt(j)-'0':0;
            sb.append(currSum%2);
            carry= currSum/2;
            i--;
            j--;
            
        }
        sb.reverse();
        int  k =0;
        while(k<sb.length() && sb.charAt(k)=='0'){
            k++;
        }
        sb.delete(0,k);
        return sb.toString();
        
    }
}
