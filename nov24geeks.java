class Solution {

    // arr: input array
    // Function to find the sum of contiguous subarray with maximum sum.
    int maxSubarraySum(int[] arr) {

        // Your code here
        int sum=0;
        int maxi=arr[0];
        for(int i=0;i<arr.length;i++){
            sum += arr[i];
            maxi = Math.max(maxi,sum);
            
            if(sum < 0){
                sum = 0;
            }
        }
        return maxi;
    }
}
