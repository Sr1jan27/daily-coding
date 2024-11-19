class Solution {
    static void reverse(int arr[], int i, int j) {
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
    
    void nextPermutation(int[] arr) {
        int n = arr.length, index = -1;

        // Step 1: Find the rightmost index where arr[index] < arr[index + 1]
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] < arr[i + 1]) {
                index = i;
                break;
            }
        }

        // Step 2: If no such index, reverse the entire array (last permutation)
        if (index == -1) {
            reverse(arr, 0, n - 1);
            return;
        }

        // Step 3: Find the smallest element greater than arr[index] to the right
        for (int i = n - 1; i > index; i--) {
            if (arr[i] > arr[index]) {
                // Swap
                int temp = arr[i];
                arr[i] = arr[index];
                arr[index] = temp;
                break;
            }
        }

        // Step 4: Reverse the suffix starting at index + 1
        reverse(arr, index + 1, n - 1);
    }
}
