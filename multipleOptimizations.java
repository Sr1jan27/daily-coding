public class multipleOptimizations {
    class Solution{
        static long count_divisors(int N){
            // code here
            long cnt=0;
            if(N%3!=0) return 0;
            for(int i=3;i<=N/2;i=i+3){
                if(N%i==0) cnt++; 
            }
            cnt++;
            return cnt;
        }
    }
}
