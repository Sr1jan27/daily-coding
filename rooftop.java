public class rooftop {
    class Solution {
        public int maxStep(int arr[]) {
            int cnt=0;
            int max = 0;
            for(int i=1;i<arr.length;i++){
                if(arr[i]>arr[i-1]) cnt++;
                else cnt=0;
                
                if(cnt>max) max =cnt;
            }
            
            return max;
        }
    }
}
