import java.util.*;
public class stackImplementation{
    static class Stack {
        ArrayList<Integer> arr;
        int cap;
        Stack(int capacity) {
            arr = new ArrayList<>();
            cap = capacity;
        }
        public void push(int num) {
            if(arr.size() < cap) arr.add(num);
        }
        public int pop() {
            if(arr.size() != 0){
                int top = arr.get(arr.size()-1);
                arr.remove(arr.size()-1);
                return top;
            }else return -1;
        }
        public int top() {
            if(arr.size() != 0) return arr.get(arr.size()-1);
            else return -1;
        }
        public int isEmpty() {
            if(arr.size() == 0) return 1;
            else return 0;
        }
        public int isFull() {
            if(arr.size() == cap) return 1;
            else return 0;
        }
    }
}