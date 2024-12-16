class Solution {
    public int kthElement(int arr1[], int arr2[], int k) {
        int count=0;
        int n=arr1.length;
        int m=arr2.length;
        int i=0;
        int j=0;
        int result=-1;
        while(i<n && j<m){
            if(arr1[i]<arr2[j]){
                result=arr1[i];
                count++;
                i++;
            }
            else{
                result=arr2[j];
                count++;
                j++;
            }
            if(count==k){
                return result;
            }
        }
        while(i<n){
            result=arr1[i];
            count++;
            i++;
            if(count==k) return result;
        }
        while(j<m){
            result=arr2[j];
            count++;
            j++;
            if(count==k) return result;
        }
        return result;
    }
}
