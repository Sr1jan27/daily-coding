public class ifYispowOfX {
    class Solution{
        static Long isPowerOfAnother(Long X, Long Y){
            // code here
            for(int i=0;i<=Y;i++){
                if(Math.pow(X,i)==Y) return 1L;
            }
            return 0L;
        }
    }
}
