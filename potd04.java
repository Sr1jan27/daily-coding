public class potd04 {
    
class Solution {
    // Function to reverse a circular linked list
    Node reverse(Node head) {
        // code here
        if(head==null || head.next == head) return null;

        Node pre = head;
        Node current = head.next;
        Node next;
        // Node first = current;
        do{
            next = current.next;
            current.next = pre;
            pre = current;
            current = next;
        }while(head != current);
         head.next = pre; // Fix the circular link
         head = pre;
        return head;
    }

    // Function to delete a node from the circular linked list
    Node deleteNode(Node last, int key) {
        // code here((
        if(last.data == key){
             Node temp = last;
            while (temp.next != last) {
                temp = temp.next;
            }
            temp.next = last.next;
           
            return last.next;
        }
        
        Node pre = last;
        Node cur = last.next;
       
        do {
            if (cur.data == key) {
                pre.next = cur.next; // Bypass the node with the key
                return last;  // Return the updated last node pointer
            }
            pre = cur;
            cur = cur.next;
        } while (cur != last.next); // Loop until we traverse the entire circular list

        // If no node with the key was found, return the unchanged list
        return last;
    }
}
}
