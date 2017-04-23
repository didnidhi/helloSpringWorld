package hello.dataStructure.linkedList;

import java.util.ArrayList;
import java.util.List;

public class LinkedLlist {

    Node node = null;
    Node head = null;

    public List<Integer> getData() {
        return new ArrayList();
    }

    public Node putData(int data) {
        if(head == null) {
            node = new Node();
            node.setData(data);
            head = node;

        }
        else {

            while(node.getLink() != null) {
                node = node.getLink();
            }
            Node newNode = new Node();
            newNode.setData(data);
            node.setLink(newNode);
        }
        return node;
    }

    public ArrayList<Integer> returnData(){
        Node n=head;
        ArrayList<Integer> al;
        al = new ArrayList<Integer>();

        if(n==null){

            return null;
        }

        while (n.getLink()!=null)
        {
            al.add(n.getData());
            n=n.getLink();
        }
          return al;
    }

}
