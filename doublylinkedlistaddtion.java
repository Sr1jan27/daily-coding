public class doublylinkedlistaddtion {
    class Solution {
        // Function to insert a new node at given position in doubly linked list.
        Node addNode(Node head, int p, int x) {
            // Your code here
            Node temp = head;
            Node newNode = new Node(x);
            for(int i=0;i<p;i++){
                // System.out.println(temp.data +"---> before");
                temp = temp.next;
                // System.out.println(temp.data+"---> after");
            }
            
            Node nextNode = temp.next;
            temp.next = newNode;
            newNode.next = nextNode;
            newNode.prev = temp;
            
            head = temp;
            
            
            return head;
            
        }
    }
}
