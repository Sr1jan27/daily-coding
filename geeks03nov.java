class Solution {
    public boolean isLengthEven(Node head) {
        // code here
         int count=0;
        Node size=head;
        while(size!=null){
            size=size.next;
            count++;
        }
        return count % 2 == 0;
    }
}
