// The New about this Program is that the Head is not Provided, Only the Node which has to be Deleted is provided
// -> The Trick: Rather than Disconnecting the Node. Copy the Next Node Data to the Current Node and Delete the Next one.
import Library.*;

public class DeleteNode {
    public static void main(String[] args) {
        LinkedNode node1 = new LinkedNode(0);
        LinkedNode head = node1;

        for (int i = 1; i < 8; i++) {
            LinkedNode node2 = new LinkedNode(i * 3);
            node1.next = node2;
            node1 = node2;
        }
        LinkedNode test = head;
        for(int i = 1; i <= 4; i++){
            test = test.next;
        }
        System.out.println(head.printLinkedNode());
        deleteSingleNode(test);
        System.out.println(head.printLinkedNode());
    }

    private static void deleteSingleNode(LinkedNode n) {
        LinkedNode temp = n.next;
        n.value = temp.value;
        n.next = temp.next;
    }
}
