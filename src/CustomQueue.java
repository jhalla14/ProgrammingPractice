/**
 * Created with IntelliJ IDEA.
 * User: Joshua Hall
 * Date: 1/13/14
 * Time: 3:37 PM
 * To change this template use File | Settings | File Templates.
 */
public class CustomQueue {
    Node first;
    Node last;

    public void enqueue(Object item){
        if (item != null){
            Node n = new Node((Integer) item);
            //check if it's the first item in the list
            //otherwise there's already something in there
            if (first == null){
               last = n;
               first = last;
            } else {
              last.next = n;   //make the old last element point to the new last element
              last = last.next; //new last element takes the title of last
            }
        }

    }

    public Object dequeue(){
        //make sure there is something in the queue
        if (first != null){
            Object item = first;
            first = first.next;
            return item;
        }

        return null;
    }

}
