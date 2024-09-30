public class simpleInterest {
        
    class Solution {
        double simpleInterest(int P, int R, int T) {
            // code here
            double rfoy = (double)P*(double)R/100;
            double tr = T*rfoy;
            // System.out.println(tr);
            return tr;
        }
    }
}
