package gent.datastructureandalgorithms.arrayqueue;


import gent.datastructureandalgorithms.arrayqueue.Employee;

public class Main {
    public static void main(String[] args) {

        Employee john = new Employee("John", "Smith", 123);
        Employee ricky = new Employee("Rick", "Johns", 6546);
        Employee joe = new Employee("Joe", "Rogan", 123);
        Employee tim = new Employee("Tim", "Sort", 6546);

        ArrayQueue queue = new ArrayQueue(10);

        queue.add(joe);
        queue.add(ricky);
        queue.add(john);
        queue.add(tim);

        queue.printQueue();

        queue.remove();
        queue.remove();

        System.out.println(queue.peek());

        queue.printQueue();


    }
}