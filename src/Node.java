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

    @Override
    public String toString() {

//        Node n = this;
//        while(n.next != null){
//            System.out.println(this.data);
//            n = n.next;
//        }

        return super.toString();    //To change body of overridden methods use File | Settings | File Templates.
    }
}
