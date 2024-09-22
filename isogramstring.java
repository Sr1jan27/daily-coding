class Solution
{
    //Function to check if a string is Isogram or not.
    static boolean isIsogram(String data){
        //Your code here
        HashMap<Character, Integer> hm = new HashMap<>();
        char[] dt = data.toCharArray();
        for(int i=0;i<dt.length;i++){
            hm.put(dt[i], hm.getOrDefault(dt[i],0)+1);
        }
        
        for(int i=0;i<dt.length;i++){
            if(hm.get(dt[i])>1) return false;
        }
        
        return true;
    }
}