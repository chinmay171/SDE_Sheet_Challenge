/****************************************************************

 Following is the class structure of the Node class:

 class Node {
     public int data;
     public Node next;

     Node()
     {
         this.data = 0;
         this.next = null;
     }
     Node(int data)
     {
         this.data = data;
         this.next = null;
     }
     Node(int data, Node next)
     {
         this.data = data;
         this.next = next;
     }
 }

 *****************************************************************/

public class LLcycle2 {
    public static Node firstNode(Node head) {
        Node slow = head;
        Node fast = head;

        boolean cyclePresent = false;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast){
                cyclePresent = true;
                break;
            }
        }
        if(cyclePresent == false) return null;
        while(slow != head){
            slow = slow.next;
            head = head.next;
        } 
        return slow;
    }
}