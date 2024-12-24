class Solution {
    public boolean searchMatrix(int[][] mat, int x) {
        int n = mat.length, m = mat[0].length;
        int low = 0;
        int high = n*m-1;
        while(low<=high){
            int mid = low + (high-low)/2;
            if(mat[mid/m][mid%m] < x){
                low = mid+1;
            } else if(mat[mid/m][mid%m] > x){
                high = mid-1;
            } else return true;
        }
        return false;
    }
}
