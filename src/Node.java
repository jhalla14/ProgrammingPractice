/**
 * Created with IntelliJ IDEA.
 * User: Joshua Hall
 * Date: 1/13/14
 * Time: 11:47 AM
 * To change this template use File | Settings | File Templates.
 */
public class Node {
    Node next = null; //pointer to next element in list
    int data;          //holds data in that element of the list


    public Node(int data){
        this.data = data;
    }

    public void appendToTail(int data){
        Node end = new Node(data);  //inserting a new Node at the end
        Node n = this;  //current Node instance

        while(n.next != null){
           n = n.next;  //move to the next pointer
        }

        n.next = end;  //make the last one the new end Node
    }

    /*
    Delete a node from the linked list
     */
    public Node deleteNode(Node head, int data){
        Node n = head;

        //if the node to delete is the head then just return the next one
        if (n.data == data){
            return head.next;
        }

        //as long as there's element in the list
        while(n.next != null){
            Node nodeToDelete = null;
            //find the node you want to delete
            if (n.next.data == data){
                //point it's pointer to the next one
                n.next = n.next.next;
                return n;
            }
            n = head.next;  //advance to the next Node
        }

        return head;
    }

}
