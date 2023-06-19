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
 };

 *****************************************************************/

public class rotateLL {
    public static int getSize(Node head){
        if(head == null) return 0;
        return getSize(head.next) + 1;
    }
    public static Node rotate(Node head, int k) {
        int size = getSize(head);
        k = k % size;
        if(k == 0) return head;
        int i = size - k;

        Node temp1 = head;
        while(i-- > 1) temp1 = temp1.next;

        Node res = temp1.next;
        temp1.next = null;
        Node temp2 = res;
        while(temp2.next != null) temp2 = temp2.next;
        temp2.next = head;

        return res;
    }
}