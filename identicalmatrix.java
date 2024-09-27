public class identicalmatrix {
    class Solution {
        int areMatricesIdentical(int n, int[][] g1, int[][] g2) {
            // code here
            
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    if(g1[i][j]!=g2[i][j]) return 0;
                }
            }
            
            return 1;
        }
    }
}
