class Solution {
    static long isSumPalindrome(long n) {
        
        if(ispal(n)) return n;
        long rev = reverse(n);
        long sum = rev+n;
        int cnt=1;
        while(cnt<6){
            if(ispal(sum)) return sum;
            else{
                rev = reverse(sum);
                sum = rev+sum;
                cnt++;
            }
        }
        
        return -1;
        
    }
    
    public static long reverse(long n){
        long rev =0;
        while(n>0){
            rev = rev*10+n%10;
            n = n/10;
        }
        return rev;
    }
    
    public static boolean ispal(long n){
        long rev =0;
        long temp= n;
        while(n>0){
            rev = rev*10+n%10;
            n = n/10;
        }
        
        if(temp==rev) return true;
        
        return false;
    }
}