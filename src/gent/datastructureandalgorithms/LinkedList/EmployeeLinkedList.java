package gent.datastructureandalgorithms.LinkedList;

public class EmployeeLinkedList {

    private EmployeeNode head;
    private int size;

    public void addToFront(Employee employee) {
        EmployeeNode node = new EmployeeNode(employee);
        node.setNext(head);//set new one to the current head
        head = node;//set the head to the new one
        size++;
    }


    public EmployeeNode removeFromFront() {
        if (isEmpty()) {
            return null;
        }

        EmployeeNode removedNode = head;
        head = head.getNext();
        size--;
        removedNode.setNext(null);

        return removedNode;
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void printList() {
        EmployeeNode current = head;
        System.out.print("(head) -> ");

        while (current != null) {
            System.out.print(current);
            System.out.print(" -> ");
            if (current.getNext() != null) {
                current = current.getNext();
            } else {
                System.out.print(" (null) \n");
                return;
            }
        }
    }
}
