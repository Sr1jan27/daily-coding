class Solve {
    int[] findTwoElement(int arr[]) {
        // code here
         int n=arr.length;
        int missing=-1,repeating=-1;
        HashSet<Integer>set=new HashSet<>();
        for(int i=0;i<n;i++)
        {
            if(set.contains(arr[i]))
            {
                repeating=arr[i];
            }
            else
            {
                set.add(arr[i]);
            }
        }
        for(int i=1;i<=n;i++)
        {
            if(!set.contains(i))
            {
                missing=i;
                break;
            }
        }
        int ans[]={repeating,missing};
        return ans;
    }
}