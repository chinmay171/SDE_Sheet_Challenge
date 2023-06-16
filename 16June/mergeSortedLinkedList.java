import java.io.*;
import java.util.* ;

// /************************************************************

    // Following is the linked list node structure:
    
    class LinkedListNode<T> {
        T data;
        LinkedListNode<T> next;

        public LinkedListNode(T data) {
            this.data = data;
        }
    }

// ************************************************************/

public class mergeSortedLinkedList {
	public static LinkedListNode<Integer> sortTwoLists(LinkedListNode<Integer> first, LinkedListNode<Integer> second) {
		LinkedListNode<Integer> curr = new LinkedListNode(-1);
        LinkedListNode<Integer> head = curr;
        while(first != null && second != null){
            if(first.data < second.data){
                curr.next = first;
                curr = curr.next;
                first = first.next;
            }else{
                curr.next = second;
                curr = curr.next;
                second = second.next;
            }
        }
        while(first != null){
            curr.next = first;
            curr = curr.next;
            first = first.next;
        }
        while(second != null){
            curr.next = second;
            curr = curr.next;
            second = second.next;
        }
        
        return head.next;
	}
}
