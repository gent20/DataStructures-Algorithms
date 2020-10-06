package gent.datastructureandalgorithms.binarysearchtree;

public class Main {
    public static void main(String[] args){

        Tree intTree = new Tree();

        intTree.insert(23);
        intTree.insert(2);
        intTree.insert(3);
        intTree.insert(22);
        intTree.insert(26);
        intTree.insert(13);
        intTree.insert(25);
        intTree.insert(5);
        intTree.insert(19);
        intTree.insert(24);

//        intTree.traverseInOrder();
//
//        System.out.println();
//
//        System.out.println(intTree.get(3).getData());

        System.out.println(intTree.max());
        System.out.println(intTree.min());




    }
}
