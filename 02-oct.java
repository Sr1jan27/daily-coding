public class 02-oct {
    class Solution {
        public static int rotateDelete(ArrayList<Integer> arr) {
            // code here
             int n = arr.size();
            if(n == 1 || n == 2)return arr.get(n-1);
            
            int[] b = {3, 2, 3, 3};
            int a = 3, j = 0;
            while(a + 4 <= n){
                a += 4;
                j++;
            }
            
            for(int i = 0; i < 4; i++){
                if(a+i == n)return arr.get(b[i]+j-1);
            }
            return 0;
        }
    }
    
}
