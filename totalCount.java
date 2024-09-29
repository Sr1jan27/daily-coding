public class totalCount {
    class Solution {
        int totalCount(int k, int[] arr) {
            int cnt = 0;
            for(int i=0;i<arr.length;i++){
                if(arr[i]%k==0){
                    cnt += arr[i]/k;
                }else {
                    cnt += arr[i]/k +1;
                }
            }
            return cnt;
        }
    }
}
