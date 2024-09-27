public class matsum {
    class Solution {
        int sumOfMatrix(int n, int m, int[][] g) {
            // code here
            int sum = 0;
            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                    sum+= g[i][j];
                }
            }
            
            return sum;
        }
    }
}
