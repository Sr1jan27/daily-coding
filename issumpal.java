class Solution {
    int isDigitSumPalindrome(int n) {
        // code here
        int sum=0;
        while(n>0){
            sum+=n%10;
            n/=10;
        }
        // System.out.println(sum);
        if(ispal(sum))
        return 1;
        
        
        return 0;
    }
    
    boolean ispal(int n){
        int rev=0;
        int t=n;
        while(n>0){
            rev=rev*10+n%10;
            n/=10;
        }
        
        if(t==rev) return true;
        return false;
    }
}