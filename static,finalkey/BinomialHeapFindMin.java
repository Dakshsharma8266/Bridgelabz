import java.util.*;

class BinomialHeapFindMin {
    static class Node {
        int key, degree;
        Node parent, child, sibling;
        Node(int k){ key=k; }
    }
    Node head;

    int getMin(){
        Node x=head,y=null;
        int min=Integer.MAX_VALUE;
        while(x!=null){
            if(x.key<min){min=x.key;y=x;}
            x=x.sibling;
        }
        return y!=null?y.key:-1;
    }
}
