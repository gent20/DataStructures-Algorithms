package gent.datastructureandalgorithms.binarysearchtree;

public class Main {
    public static void main(String[] args){

        Tree intTree = new Tree();

        intTree.insert(25);
        intTree.insert(20);
        intTree.insert(15);
        intTree.insert(27);
        intTree.insert(30);
        intTree.insert(29);
        intTree.insert(26);
        intTree.insert(22);
        intTree.insert(32);
        intTree.insert(17);

//        intTree.traverseInOrder();
//
//        System.out.println();
//
//        System.out.println(intTree.get(3).getData());
//
//        System.out.println(intTree.max());
//        System.out.println(intTree.min());

        intTree.traverseInOrder();
        System.out.println();

//        intTree.delete(3);

        intTree.traversePreOrder();
        System.out.println();

        intTree.traversePostOrder();
        System.out.println();



    }
}
