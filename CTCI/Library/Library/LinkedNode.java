// Implementation of singly Linked List
package Library;

public class LinkedNode {
    public int value;
    public LinkedNode next;
    
    public LinkedNode(){

    }

    public LinkedNode(int value){
        this.value = value;
    }

    public LinkedNode(int value, LinkedNode next){
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
