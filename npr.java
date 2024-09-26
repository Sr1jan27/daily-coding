public class npr {
    class Solution{
        static long nPr(long n, long r){
            // code here
            
            long np = 1;
            long nr = 1;
            for(int i=1;i<=n;i++){
                np = np*i;
            }
            
            for(int i=1;i<=n-r;i++){
                nr = nr*i;
            }
            
            return  np/nr;
        }
    }
}
