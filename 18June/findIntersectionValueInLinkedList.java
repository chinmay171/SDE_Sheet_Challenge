// /****************************************************************

//  Following is the class structure of the Node class:

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

//  *****************************************************************/

public class findIntersectionValueInLinkedList {

    public static int getSize(Node head){
        if(head == null) return 0;
        return getSize(head.next) + 1;
    }

    public static int findIntersection(Node firstHead, Node secondHead) {
        int size1 = getSize(firstHead);
        int size2 = getSize(secondHead);

        int diff = Math.abs(size1 - size2);
        if(size1 > size2) while(diff-- > 0) firstHead = firstHead.next;
        else while(diff-- > 0) secondHead = secondHead.next;

        while(firstHead != null && secondHead != null){
            if(firstHead == secondHead) return firstHead.data;
            firstHead = firstHead.next;
            secondHead = secondHead.next;
        }

        return -1;
    }
}