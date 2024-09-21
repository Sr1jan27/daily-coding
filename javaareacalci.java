class Solution{
    static double switchCase(int choice, List<Double> arr){
        if(choice==1){
            double a = Math.PI*arr.get(0)*arr.get(0);
            return a;
        }else {
            double a = arr.get(0)*arr.get(1);
            return a;
        }
    }
}