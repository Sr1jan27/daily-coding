public class sumOfAp {
    class Solution
    {
        public long sum_of_ap(long n, long a, long d)
        {
            // Code her
            long s  =0 ;
            for(int i=1;i<=n;i++){
                s = s + a+(i-1)*d;
            }
            return s;
        }
    }
}
