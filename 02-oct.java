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



                 static HashMap<String, Integer> dp;
    
    public int getMaxSum(Node root) {
        dp = new HashMap<>();
        return solver(root, false);
    }

    static int solver(Node root, boolean take) {
        if (root == null)
            return 0;
        
        String key = root.hashCode() + "_" + take; // Unique key for (node, take)
        if (dp.containsKey(key))
            return dp.get(key);
        
        int c = 0;
        if (take == false) {
            c = root.data + solver(root.left, true) + solver(root.right, true);
        }
        
        int max = solver(root.left, false) + solver(root.right, false);
        
        int ans = Math.max(max, c);
        dp.put(key, ans);
        return ans;
    }
                
            }

            
            for(int i = 0; i < 4; i++){
                if(a+i == n)return arr.get(b[i]+j-1);
            }
            return 0;

                int start  = 0;
            HashMap<Character, Integer> hm = new HashMap<>();
            int max = 0;
            for(int end = 0;end<length;end++){
                if(hm.containsKey(s.charAt(end) && hm.get(s.charAt(end))>=0){
                    start = hm.get(s.charAt(end))+1;
                }
                else{
                    hm.put(s.charAt(end), end);
                    max = Math.max(max, end-start+1);
                }
            }
            return max;
        }
    }
    
}
