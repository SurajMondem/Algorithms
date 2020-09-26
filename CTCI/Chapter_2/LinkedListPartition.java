import Library.*;

public class LinkedListPartition {
    public static void main(String[] args) {
        LinkedNode node1 = new LinkedNode(0);
        LinkedNode head = node1;

        for (int i = 1; i < 8; i++) {
            LinkedNode node2 = new LinkedNode(i * 3);
            node1.next = node2;
            node1 = node2;
        }

        // Random input
        LinkedNode random = RandomInputs.randomLinkedList(10, 0, 20);



        LinkedNode result = createPartition(head, 9);
        System.out.println(result.printLinkedNode());
        System.out.println("Random inputs");
        System.out.println(random.printLinkedNode());
        LinkedNode result1 = createPartition(random, 10);
        System.out.println(result1.printLinkedNode());
    }


    private static LinkedNode createPartition (LinkedNode n, int partition){
        LinkedNode left = null;
        LinkedNode head1 = null;
        LinkedNode right = null;
        LinkedNode head2 = null;

        while (n != null) {
            
            if(n.value < partition){
                if(head1 == null){
                    head1 = n;
                    left = head1;
                }
                else {
                    left.next = n;
                    left = n;
                }
            }
            else{
                if (head2 == null) {
                    head2 = n;
                    right = head2;
                } else {
                    right.next = n;
                    right = n;
                }
            }
            n = n.next;
        }

        left.next = head2;
        
        return head1;
    }
}