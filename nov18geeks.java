class Solution {
    // Function to rotate an array by d elements in counter-clockwise direction.
    static void rotateArr(int arr[], int d) {
        // add your code here
        int rotates = d%arr.length;
        int[] array = new int[rotates];
        for(int i=0;i<rotates;i++)
        {
            array[i]=arr[i];
        }
        int k=0;
        for(int i=rotates;i<arr.length;i++)
        {
            arr[k]=arr[i];
            k++;
        }
        k=arr.length-rotates;
        for(int i=0;i<rotates;i++)
        {
            arr[k]=array[i];
            k++;
        }
    }
}
