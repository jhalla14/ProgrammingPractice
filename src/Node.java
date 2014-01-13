/**
 * Created with IntelliJ IDEA.
 * User: Joshua Hall
 * Date: 1/13/14
 * Time: 11:47 AM
 * To change this template use File | Settings | File Templates.
 */
public class Node {
    Node next = null;
    int data;

    public Node(int data){
        this.data = data;
    }

    public void appendToTail(int data){
        Node end = new Node(data);
        Node n = this;

        while(n.next != null){
           n = n.next;
        }

        n.next = end;
    }


}
