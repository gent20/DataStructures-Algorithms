package gent.datastructureandalgorithms.linkedstack;



public class Main {

    public static void main(String[] args){

        Employee john = new Employee("John", "Smith", 123);
        Employee ricky = new Employee("Rick", "Johns", 6546);
        Employee joe = new Employee("Joe", "Rogan", 123);
        Employee tim = new Employee("Tim", "Sort", 6546);

        LinkedStack stack = new LinkedStack();

        stack.printStack();

        stack.push(john);
        stack.push(ricky);
        stack.push(joe);
        stack.push(tim);

        stack.printStack();

        System.out.println(stack.peek());

        stack.pop();
        stack.pop();

        stack.printStack();
    }
}
