class Solution {
    static ArrayList<Integer> modifyAndRearrangeArr(int arr[]) {
        // Complete the function
         ArrayList<Integer> l1 = new ArrayList<Integer>();
        
        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i] == arr[i+1])
            {
                arr[i] = 2*arr[i];
                arr[i+1] = 0;
            }
            if(arr[i] != 0)
            {
                l1.add(arr[i]);
            }
            
        }

        

        

        
        l1.add(arr[arr.length-1]);
        int j=l1.size();
        while(j< arr.length)
        {
            l1.add(0);
            j++;
        }
        return l1;
    }
}
