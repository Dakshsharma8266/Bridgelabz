import java.util.*;

class BinomialHeapExtractMin {
    static class Node {
        int key, degree;
        Node parent, child, sibling;
        Node(int k){ key=k; }
    }
    Node head;

    Node unionHeaps(Node h1,Node h2){return h1;} 

    void extractMin(){
        if(head==null)return;
        Node minNode=head,minPrev=null,prev=null,curr=head;
        int min=curr.key;
        while(curr!=null){
            if(curr.key<min){min=curr.key;minNode=curr;minPrev=prev;}
            prev=curr;curr=curr.sibling;
        }
        if(minPrev!=null)minPrev.sibling=minNode.sibling;
        else head=minNode.sibling;
        Node child=minNode.child,rev=null;
        while(child!=null){
            Node next=child.sibling;
            child.sibling=rev;
            child.parent=null;
            rev=child;
            child=next;
        }
        head=unionHeaps(head,rev);
    }
}
