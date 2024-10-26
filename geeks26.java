class Solution {
    public static int count(Node head, int key) {
        // code here
         if( head == null)   return 0;
        if(head.data == key)    return 1+ count(head.next,key);
        return count(head.next,key);
    }
}
