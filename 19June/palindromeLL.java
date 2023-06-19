 
/****************************************************************

    Following is the class structure of the LinkedListNode class:
	
	class LinkedListNode<T> {
    	T data;
    	LinkedListNode<T> next;

    	public LinkedListNode(T data) {
        	this.data = data;
    	}
	}

*****************************************************************/

public class palindromeLL {

	public static LinkedListNode<Integer> reverseLL(LinkedListNode<Integer> head){
		LinkedListNode<Integer> prev = null;
		LinkedListNode<Integer> n =  null;

		while(head != null){
			n = head.next;
			head.next = prev;
			prev = head;
			head = n;
		}
		return prev;
	}
	
	public static boolean isPalindrome(LinkedListNode<Integer> head) {
		if(head == null || head.next == null) return true;
		LinkedListNode<Integer> slow = head;
		LinkedListNode<Integer> fast = head;

		while(fast.next != null && fast.next.next != null){
			slow = slow.next;
			fast = fast.next.next;
		}
		
		slow.next = reverseLL(slow.next);
		slow = slow.next;

		while(slow != null){
			if(head.data != slow.data) return false;

			head = head.next;
			slow = slow.next;
		}

		return true;
	}
}