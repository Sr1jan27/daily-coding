
class Solution{
    boolean isSubSequence(String A, String B){
        
        int a = 0;
        for(int i=0;i<B.length()&&a<A.length();i++){
            if(B.charAt(i)==A.charAt(a)) a++;
        }
        
        return a==A.length()?true:false;
    }
}