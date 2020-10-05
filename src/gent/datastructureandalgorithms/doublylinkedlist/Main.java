package gent.datastructureandalgorithms.doublylinkedlist;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();


        Employee janeJohns = new Employee("Jane", "Jones", 123);
        Employee johnDoe = new Employee("John", "Does", 6546);
        Employee kenedySmith = new Employee("Kenedy", "Smith", 78);
        Employee rickyJers = new Employee("Ricky", "Jers", 728);

        EmployeeDoublyLinkedList list = new EmployeeDoublyLinkedList();
        list.addToFront(janeJohns);
        list.addToFront(johnDoe);
        list.addToFront(kenedySmith);

        list.printList();
        System.out.println(list.getSize());


        list.addToEnd(rickyJers);
        list.printList();
        System.out.println(list.getSize());


        list.removeFromFront();
        System.out.println(list.getSize());
        list.printList();


        list.removeFromEnd();
        System.out.println(list.getSize());
        list.printList();
    }
}