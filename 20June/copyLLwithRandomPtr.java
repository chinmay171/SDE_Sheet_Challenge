import java.io.*;
import java.util.* ;

// /*************************************************************

    // Following is the LinkedListNode class structure

    class LinkedListNode<T> {
	    T data;
	    LinkedListNode<T> next;
	    LinkedListNode<T> random;

	    public LinkedListNode(T data) {
		    this.data = data;
	    }
    }

// *************************************************************/

public class copyLLwithRandomPtr {
	public static LinkedListNode<Integer> cloneRandomList(LinkedListNode<Integer> head) {
		HashMap<LinkedListNode<Integer>, LinkedListNode<Integer>> map = new HashMap<>();

		LinkedListNode<Integer> temp = head;

		while(temp != null){
			LinkedListNode<Integer> deepCopy = new LinkedListNode(temp.data);
			map.put(temp, deepCopy);
			temp = temp.next;
		}

		temp = head;

		while(temp != null){
			LinkedListNode<Integer> deepCopied = map.get(temp);
			deepCopied.next = (temp.next != null) ? map.get(temp.next) : null;
			deepCopied.random = (temp.random != null) ? map.get(temp.random) : null;
			temp = temp.next;
		}

		return map.get(head);
	}
}
