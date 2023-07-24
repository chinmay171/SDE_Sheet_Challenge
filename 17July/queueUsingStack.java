import java.util.*;
public class queueUsingStack{
    static class Queue {
        // Define the data members(if any) here.
        Stack<Integer> stk;
        Queue() {
            // Initialize your data structure here.
            stk = new Stack<>();
        }

        void enQueue(int val) {
            // Implement the enqueue() function.
            Stack<Integer> temp = new Stack<>();
            while(stk.size() > 0)
                temp.push(stk.pop());
            stk.push(val);
            while(temp.size() > 0)
                stk.push(temp.pop());
        }

        int deQueue() {
            // Implement the dequeue() function.
            if(stk.size() == 0) return -1;
            return stk.pop();
        }

        int peek() {
            // Implement the peek() function here.
            if(stk.size() == 0) return -1;
            int top = stk.pop();
            stk.push(top);
            return top;
        }

        boolean isEmpty() {
            // Implement the isEmpty() function here.
            if(stk.size() == 0) return true;
            return false;
        }
    }
}