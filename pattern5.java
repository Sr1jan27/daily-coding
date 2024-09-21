class Solution {
    void printTriangle(int n) {
        int temp = n;
        for(int i=1;i<=n;i++){
            for(int j=temp;j>0;j--){
                System.out.print("* ");
            }
            temp--;
            System.out.println();
        }
    }
}