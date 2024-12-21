
class Solution {
    // Function to rotate matrix anticlockwise by 90 degrees.
    static void rotateby90(int mat[][]) {
        int end=mat.length-1;
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<=end;j++){
                int temp=mat[i][j];
                mat[i][j]=mat[i][end];
                mat[i][end]=temp;
                end--;
            }
            end=mat.length-1;
        }
        int ans=0;
        for(int i=0;i<mat.length;i++){
            for(int j=i;j<mat.length && ans<mat.length; j++){
                int temp=mat[i][j];
                mat[i][j]=mat[ans][i];
                mat[ans][i]=temp;
                ans++;
            }
            ans=i;
            ans++;
        }
    }

}
