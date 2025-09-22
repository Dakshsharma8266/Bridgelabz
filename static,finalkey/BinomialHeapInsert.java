import java.util.*;

class BinomialHeapInsert {
    static class Node {
        int key, degree;
        Node parent, child, sibling;
        Node(int k){ key=k; }
    }
    Node head;

    Node mergeTrees(Node b1, Node b2){
        if(b1.key>b2.key){Node t=b1;b1=b2;b2=t;}
        b2.parent=b1;
        b2.sibling=b1.child;
        b1.child=b2;
        b1.degree++;
        return b1;
    }

    Node mergeLists(Node h1, Node h2){
        if(h1==null) return h2;
        if(h2==null) return h1;
        Node head;
        if(h1.degree<=h2.degree){head=h1;h1=h1.sibling;}
        else{head=h2;h2=h2.sibling;}
        Node tail=head;
        while(h1!=null&&h2!=null){
            if(h1.degree<=h2.degree){tail.sibling=h1;h1=h1.sibling;}
            else{tail.sibling=h2;h2=h2.sibling;}
            tail=tail.sibling;
        }
        tail.sibling=(h1!=null)?h1:h2;
        return head;
    }

    Node unionHeaps(Node h1, Node h2){
        Node newHead=mergeLists(h1,h2);
        if(newHead==null) return null;
        Node prev=null,curr=newHead,next=curr.sibling;
        while(next!=null){
            if(curr.degree!=next.degree || (next.sibling!=null && next.sibling.degree==curr.degree)){
                prev=curr;curr=next;
            }else{
                if(curr.key<=next.key){
                    curr.sibling=next.sibling;
                    curr=mergeTrees(curr,next);
                }else{
                    if(prev==null)newHead=next;
                    else prev.sibling=next;
                    curr=mergeTrees(next,curr);
                }
            }
            next=curr.sibling;
        }
        return newHead;
    }

    void insert(int key){
        Node node=new Node(key);
        head=unionHeaps(head,node);
    }

    public static void main(String[] args){
        BinomialHeapInsert h=new BinomialHeapInsert();
        int[] arr={7,2,4,17,1,11,6,8,15,10,20};
        for(int x:arr) h.insert(x);
    }
}
