class Solution {
    int[][] sortedMatrix(int N, int Mat[][]) {
        
        int[] sta = new int[N*N];
        int a =0;
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                sta[a] = Mat[i][j];
                a++;
            }
        }
        int k=0;
        Arrays.sort(sta);
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                Mat[i][j] = sta[k];
                k++;
            }
        }
        
        return Mat;
    }
};