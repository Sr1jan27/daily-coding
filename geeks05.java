public class geeks05 {
    class Solution {
        public long findSmallest(int[] arr) {
            // Your code goes here
            int ans = 1;
            for(int i=0;i<arr.length;i++){
                if(arr[i]>ans) return ans;
                else ans+=arr[i];
            }
            
            return ans;
        }
    }
}
