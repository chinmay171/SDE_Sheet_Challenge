/****************************************************************

 Following is the class structure of the Node class:

 class Node {
     public int data;
     public Node next;
     public Node prev;

     Node()
     {
         this.data = 0;
         this.next = null;
         this.prev = null;
     }

     Node(int data)
     {
         this.data = data;
         this.next = null;
         this.prev = null;
     }

     Node(int data, Node next)
     {
         this.data = data;
         this.next = next;
         this.prev = next;
     }
 };

 *****************************************************************/

public class deleteKthNodeFromBack
{
    // static int getSize(Node head){
    //     if(head == null) return 0;
    //     return getSize(head.next) + 1;
    // }
    public static Node removeKthNode(Node head, int K){
        // int size = getSize(head);
        // int t = size - K;
        // if(t == 0) return head.next;
        // int i = 0;

        // Node temp = head;
        // while(i < t-1){
        //     temp = temp.next;
        //     i++;
        // }

        // temp.next = temp.next.next;
        // return head;
        // Node temp = head;
        Node left = head;
        Node right = head;
        
        for(int i = 0; i < K; ++i){
            if(right.next == null) return head.next;
            right = right.next;
        }
        while(right.next != null){
            right = right.next;
            left = left.next;
        }
        left.next = left.next.next;
        return head;
    }
}