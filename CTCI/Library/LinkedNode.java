// Implementation of singly Linked List

public class LinkedNode {
    int value;
    public LinkedNode next;
    public LinkedNode last;

    LinkedNode(){

    }

    LinkedNode(int value){
        this.value = value;
    }

    LinkedNode(int value, LinkedNode next){
        this.value = value; this.next = next;
    }

    public String printLinkedNode(){
        if(next != null){
            return value + "->" + next.printLinkedNode();
        }
        else {
            return value + "";
        }
    }
}
