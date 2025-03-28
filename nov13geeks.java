class Intersect {
    // Function to find intersection point in Y shaped Linked Lists.
    int intersectPoint(Node head1, Node head2) {
        Node nodeA = head1, nodeB = head2;
        while(nodeA != nodeB) {
            nodeA = nodeA.next==null? head2 : nodeA.next;
            nodeB = nodeB.next == null ? head1 : nodeB.next;
        }
        return nodeA.data;
    }
}
