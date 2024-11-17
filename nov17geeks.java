class Solution {

    public void reverseArray(int arr[]) {

        // code here

       int i, temp;

       for(i=0;i<arr.length/2;i++)

       {

           temp=arr[i];

           arr[i]=arr[arr.length-i-1];

           arr[arr.length-i-1]=temp;

       }

    }

}
