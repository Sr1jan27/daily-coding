public class sumevenandodd {
    
    class Solution
    {
        public int[] find_sum(int n)
        {
            // Code here
            int[] sum = new int[2];
            for(int i=1;i<=n;i++){
                if(i%2==0)sum[1] += i;
                else sum[0]+=i;
            }
            return sum;
        }
    }
}
