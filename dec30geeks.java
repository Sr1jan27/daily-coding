class Solution {
    public static int findUnion(int a[], int b[]) {
        // code here
        int n=a.length;
        int m=b.length;
        HashSet<Integer> hs=new HashSet<>();
        for(int i:a){
            hs.add(i);
        }
        for(int i:b){
            hs.add(i);
        }
        
        return hs.size();
    }
}
