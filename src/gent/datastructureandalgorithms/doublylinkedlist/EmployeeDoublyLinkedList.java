package gent.datastructureandalgorithms.doublylinkedlist;

public class EmployeeDoublyLinkedList {

    private EmployeeNode head;
    private EmployeeNode tail;
    private int size;

    public void addToFront(Employee employee){
        EmployeeNode node = new EmployeeNode(employee);
        node.setNext(head);//set new one to the current head

        if(head==null){//if insert to empty list
            tail=node;
        }
        else{
            head.setPrevious(node);
        }
        head = node;//set the head to the new one
        size++;
    }

    public void addToEnd(Employee employee){
        EmployeeNode node = new EmployeeNode(employee);

        if(head==null){//if insert to empty list
            head=node;
        }
        else{
            tail.setNext(node);
            node.setPrevious(tail);
        }

        tail=node;
        size++;

    }


    public EmployeeNode removeFromFront(){
        if (isEmpty()){
            return null;
        }

        EmployeeNode removedNode = head;

        if(head.getNext()==null){//only one in the list
            tail=null;
        }
        else{
            head.getNext().setPrevious(null);
        }
        head = head.getNext();
        size--;
        removedNode.setNext(null);
        return removedNode;
    }

    public EmployeeNode removeFromEnd(){
        if (isEmpty()){
            return null;
        }

        EmployeeNode removedNode = tail;
        if(tail.getPrevious()==null){//only one in the list
            head=null;
        }
        else{
            tail.getPrevious().setNext(null);
        }
        tail = tail.getPrevious();
        size--;
        removedNode.setNext(null);
        return removedNode;

    }

    public int getSize(){
        return size;
    }

    public boolean isEmpty(){
        return head==null;
    }

    public void printList(){
        EmployeeNode current = head;
        System.out.print("head------>");
        while(current!=null){
            System.out.print(current);
            System.out.println("<->");
            current = current.getNext();
        }
    }
}