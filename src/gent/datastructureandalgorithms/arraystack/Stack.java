package gent.datastructureandalgorithms.arraystack;

public class Stack {

    private int[] array;
    private int capacity;
    private int top;

    public Stack(int capacity) {
        array = new int[capacity]
        this.capacity = capacity;
        this.top = -1;
    }

    public void push(int item){
        if(isFull()){
            throw new RuntimeException("Stack is full");
        }
        array[++top] = item;
    }

    public int pop(){
        if(isEmpty()){
            throw new RuntimeException("Stack is empty");
        }
       return array[top--];
    }

    public int peek(){
        if(isEmpty()){
            throw new RuntimeException("Stack is Empty");
        }
        return array[top];
    }

    private boolean isEmpty() {
        return top == -1
    }

    private boolean isFull() {
        return top == capacity -1;
    }
}
