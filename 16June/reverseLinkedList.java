import java.io.*;
import java.util.* ;


	// Following is the structure of the Singly Linked List.	
	class LinkedListNode<T> 
    {
    	T data;
    	LinkedListNode<T> next;
    	public LinkedListNode(T data) 
        {
        	this.data = data;
    	}
	}


public class reverseLinkedList 
{
    public static LinkedListNode<Integer> reverseLinkedList(LinkedListNode<Integer> curr) 
    {
		LinkedListNode<Integer> prev = null;
		while(curr != null){
			LinkedListNode<Integer> temp = curr.next;
			curr.next = prev;
			prev = curr;
			curr = temp;
		}
		return prev;
    }
}