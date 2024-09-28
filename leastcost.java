public class leastcost {
    
class Solution {
    public int minimizeCost(int k, int arr[]) {
        // code here
         int[]dp = new int[arr.length];
        for(int i = arr.length-2 ; i >= 0 ;i--){
            int mini = Integer.MAX_VALUE;
            for(int j = 1 ; j <= k ;j++){
                if(i+j < arr.length){
                    int x = dp[i+j];
                        x += Math.abs(arr[i] - arr[i+j]);
                        mini =  Math.min(mini,x);
                }
            }
            dp[i] = mini;
        }
        return dp[0];
    }
}

}
