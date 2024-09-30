public class minProd {
    int minProduct(int arr[], int k) {
        // Complete the function
        // long ans = 1;
        // Arrays.sort(arr);
        // for(int i=0;i<k;i++){
        //     ans = (ans*arr[i])%(1000000007) ;
        // }
        
        // return (int)ans ;
         Arrays.sort(arr);
        long product =1;
         k = Math.min(k,arr.length);
        for(int i=0;i<k;i++)
        {
            product=(product*arr[i])%1000000007;
        }
        return (int)product;
        
        //  int mod = 1000000007;
        // int n = arr.length;
        // // Sorting the array in ascending order
        // Arrays.sort(arr);

        // // Setting n to the minimum value between n and k
        // n = Math.min(n, k);

        // // Initializing the answer to 1
        // long ans = 1;

        // // Calculating the product of the first n elements in the sorted array
        // for (int i = 0; i < n; i++) {
        //     ans = (ans * arr[i]) % mod;
        // }

        // // Casting the answer to int and returning it
        // return (int)ans;
    }
}
