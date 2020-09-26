public class KthNodeToLast {
    public static void main(String[] args) {
        LinkedNode node1 = new LinkedNode(0);
        LinkedNode head = node1;

        for (int i = 1; i < 8; i++) {
            LinkedNode node2 = new LinkedNode(i * 3);
            node1.next = node2;
            node1 = node2;
        }
        System.out.println(head.printLinkedNode());
        LinkedNode result = nthNodeToLast(head, 2);
        System.out.println(result.value);
    }


    private static LinkedNode nthNodeToLast(LinkedNode n, int k){
        LinkedNode p1 = n;
        LinkedNode p2 = n;

        for (int i = 0; i < k; i++) {
            if(p1 == null) return null;
            p1 = p1.next;
        }

        while (p1 != null) {
            p1 = p1.next;
            p2 = p2.next;
        }

        return p2;

    }
}
