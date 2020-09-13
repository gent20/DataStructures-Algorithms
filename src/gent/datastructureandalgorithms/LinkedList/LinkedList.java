package gent.datastructureandalgorithms.LinkedList;

import java.util.ArrayList;
import java.util.List;

public class LinkedList {
    public static void main(String[] args) {

        List<Employee> employeeList = new ArrayList<>();


        Employee john = new Employee("John", "Smith", 123);
        Employee ricky = new Employee("Rick", "Johns", 6546);
        Employee joe = new Employee("Joe", "Rogan", 123);
        Employee tim = new Employee("Tim", "Sort", 6546);

        EmployeeLinkedList list = new EmployeeLinkedList();

        list.addToFront(john);
        list.addToFront(ricky);
        list.addToFront(joe);
        list.addToFront(tim);



        list.printList();

        list.removeFromFront();

        System.out.println(list.getSize());
        list.printList();
    }
}
