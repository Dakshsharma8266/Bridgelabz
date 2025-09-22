import java.util.*;

class BinomialHeapDisplay {
    static class Node {
        int key, degree;
        Node parent, child, sibling;
        Node(int k){ key=k; }
    }
    Node head;

    void printTree(Node n){
        if(n==null)return;
        System.out.print(n.key+" ");
        printTree(n.child);
        printTree(n.sibling);
    }

    void display(Node h){
        while(h!=null){
            System.out.print("B"+h.degree+": ");
            printTree(h);
            System.out.println();
            h=h.sibling;
        }
    }
}
