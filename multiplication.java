class Solution{
    static ArrayList<Integer> getTable(int N){
        
        ArrayList<Integer> al =  new ArrayList<>();
        
        for(int i=1;i<11;i++){
            al.add(N*i);
        }
        return al;
    }
}