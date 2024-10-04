public class series {
    class Solution {
        static int findNthTerm(int N) {
            // code here
            int cont = 2;
            int se = 1;
            if(N ==1) return 1;
            // System.out.println(se);
            for(int i=2;i<=N;i++){
                se = se+cont;
                // System.out.println(se);
                cont++;
            }
            // System.out.println("-----------------------------");
            
            return se;
        }
    };
    
}
