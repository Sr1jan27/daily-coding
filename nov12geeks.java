class Solution {
    static boolean canAttend(int[][] arr) {
        // Your code here
         Arrays.sort(arr, 
            (a, b) -> a[0]-b[0]);
        int n = arr.length;
        for(int i=0; i<n-1; i++){
            if(arr[i][1] > arr[i+1][0]){
                return false;
            }
        }
        return true;
    }
}
