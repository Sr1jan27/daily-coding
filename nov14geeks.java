class Solution {
    // Non-static method, so you need to call it on an instance of the class
    public void nearlySorted(int[] arr, int k) {
        // code
        PriorityQueue<Integer>pq= new PriorityQueue<>();
        int n= arr.length;
        for(int i=0;i<=k;i++)pq.add(arr[i]);
        
    int ind=0;
    
    for( int i=k+1;i<n;i++){
        arr[ind++]=pq.poll();
        pq.add(arr[i]);
        
        
        
    }
    
    while(!pq.isEmpty()){
        arr[ind++]=pq.poll();
    }
    
    
    
    }
}
