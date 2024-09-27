public class pattern7 {
    class Solution {

        void printTriangle(int n) {
            int m = 2*n-1;
            for(int i=1;i<=n;i++){
                for(int j=1;j<=n-i;j++){
                    System.out.print(" ");
                }
                for(int k=1;k<=2*i-1;k++){
                    System.out.print("*");
                }
                System.out.println();
            }
            
        }
    }
}
