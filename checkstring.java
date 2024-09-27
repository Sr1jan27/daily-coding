public class checkstring {
    class Sol
{
    Boolean check (String s)
    {
        // your code here  
        boolean b = false;
        if(s.length()==1) return true;
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)!=s.charAt(i-1)){
                b=false;
                break;
            } 
            else b = true;
        }
        
        return b;
        
        // HashMap<Character,Integer> hs = new HashMap<>();
        // for(int i=0;i<s.length();i++){
        //     hs.add(s.charAt(i), s.getOrDefault(s.charAt(i),0)+1);
        // }
        
        // if(hs.get(0)==s.length()) return true;
        
        // return false;
    }
}
}
