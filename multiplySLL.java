public class multiplySLL {
    class Solution {
        public long multiplyTwoLists(Node first, Node second) {
            // Code here
            int mod = 1000000007;
            long f = 0,s=0;
            while(first!=null){
                f = (f*10+first.data)%mod;
                first = first.next;
            }
            // f = f*10 + first.data;
            while(second!=null){
                s = (s*10+second.data)%mod;
                second = second.next;
            }
            // s = s*10 + second
            // System.out.println(f+" "+s);
            
            long ans = (f*s)%mod;
            // int rev = 0;
            
            // while(ans!=0){
            //     rev = rev*10+ans%10;
            //     ans/=10;
            // }
            // Node ret = new Node(rev%10);
            // rev/=10;
            // while(rev!=0){
            //     ret.data = rev%10;
            //     ret = ret.next;
            //     rev/=10;
            // }
            return ans;
            
        }
    }
}
