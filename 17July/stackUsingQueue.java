import java.util.*;
public class stackUsingQueue{
    static class Stack {
        Queue<Integer> q;
        public Stack(){
            q = new ArrayDeque<>();
        }

        public int getSize() {
            // Implement the getSize() function.
            return q.size();
        }

        public boolean isEmpty() {
            // Implement the isEmpty() function.
            if(q.size() == 0) return true;
            return false;
        }

        public void push(int element) {
            // Implement the push(element) function.
            Queue<Integer> temp = new ArrayDeque<>();
            while(q.size() > 0)
                temp.add(q.remove());
            q.add(element);
            while(temp.size() > 0)
                q.add(temp.remove());
        }

        public int pop() {
            // Implement the pop() function.
            if(q.size() == 0) return -1;
            return q.remove();
        }

        public int top() {
            // Implement the top() function.
            if(q.size() == 0) return -1;
            return q.element();
        }
    }
}