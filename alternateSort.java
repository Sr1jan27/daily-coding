import java.util.ArrayList;
import java.util.Arrays;

public class alternateSort {
    class Solution {
    public static ArrayList<Integer> alternateSort(int[] arr) {

        // Your code goes here
        ArrayList<Integer> ret = new ArrayList<>();
        Arrays.sort(arr);
        int i=0,j = arr.length-1;
        while(i<j){
            ret.add(arr[j]);
            ret.add(arr[i]);
            j--;
            i++;
        }
        
        if(arr.length%2!=0) ret.add(arr[i]);
        
        return ret;
        
    }
}

}
