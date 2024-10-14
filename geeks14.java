class Solution {
    // Function to count nodes of a linked list.
    public int getCount(Node head) {
        // code here
        int cnt=0;
        while(head.next!=null){
            cnt++;
            head = head.next;
        }
        cnt++;
        return cnt;
    }
}
