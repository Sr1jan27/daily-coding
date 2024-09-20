class Solution {
    // Returns count buildings that can see sunlight
    public int countBuildings(int[] h) {
        // code here
        
        int cnt = 1;
        int max = h[0];
        for(int i=1;i<h.length;i++){
            if(max<h[i]){
                cnt++;
                max = h[i];
            } 
        }
        return cnt;
    }
}