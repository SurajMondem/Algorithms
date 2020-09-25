import java.util.HashSet;

//import CTCI.Library.*;

public class RemoveDups {
    public static void main(String[] args) {
        LinkedNode node1 = new LinkedNode(0);
        LinkedNode head = node1;
        
        for (int i = 1; i < 8; i++) {
            LinkedNode node2 = new LinkedNode(i % 3);
            node1.next = node2;
            node1 = node2;
        }
        System.out.println(head.printLinkedNode());
        removeDuplicate(head);
        System.out.println(head.printLinkedNode());
    }


    private static void removeDuplicate (LinkedNode l1){
        HashSet<Integer> set = new HashSet<>();
        LinkedNode prev = null;
        while (l1 != null) {
            if(set.contains(l1.value)){
                prev.next = l1.next;
            }
            else{
                set.add(l1.value);
                prev = l1;
            }
            l1 = l1.next;
        }
    }
}
