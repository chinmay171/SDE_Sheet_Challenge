import java.util.* ;
import java.io.*; 
public class queueImplementation {
    
    ArrayList<Integer> arr;

    boolean isEmpty() {
        if(arr.size() == 0) return true;
        return false;
    }

    void enqueue(int data) {
        arr.add(data);
    }

    int dequeue() {
        if(arr.size() == 0) return -1;
        int top = arr.get(0);
        arr.remove(0);
        return top;
    }

    int front() {
        if(arr.size() == 0) return -1;
        return arr.get(0);
    }

}
