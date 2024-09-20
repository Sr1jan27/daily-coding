class Solution{
    static List<Integer> get(int a,int b)
    {
        // code here
        int temp  =a;
        a = b;
        b  = temp;

        List<Integer> li = new ArrayList<>();
        li.add(a);
        li.add(b);
        return li;
    }
}