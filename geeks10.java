public class geeks10 {
    class Solution {
        public int maxDistance(int[] arr) {
            // Code here
            
            int max= 0;
            HashMap<Integer, Integer> hm = new HashMap<>();
            for(int i=0;i<arr.length;i++){
                if(!hm.containsKey(arr[i])){
                    hm.put(arr[i], i);
                }
                else {
                    max = Math.max(max, i-hm.get(arr[i]));
                }
            }
            return max;
        }
        
        // commment store the last position of each element 
        // now loop again and find if last poistion is not the current position 
        // if not save the diff of last position and current position 
        // check with a floater if the current diff is > max  if yes max = current diff 
        // at last return the max 
    }
}
