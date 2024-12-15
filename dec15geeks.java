
class Solution {

    public int peakElement(int[] arr) {
        // code here
          int n = arr.length;

 

        // Handle edge case: single-element array

        if (n == 1) return 0;

 

        // Loop through the array to find a peak element

        for (int i = 0; i < n; i++) {

            if (i == 0) {

                // Check if the first element is a peak

                if (arr[0] >= arr[1]) return i;

            } else if (i == n - 1) {

                // Check if the last element is a peak

                if (arr[n - 1] >= arr[n - 2]) return i;

            } else {

                // Check if the current element is greater than or equal to neighbors

                if (arr[i] >= arr[i - 1] && arr[i] >= arr[i + 1]) return i;

            }

        }

 

        return -1;
    }
}
