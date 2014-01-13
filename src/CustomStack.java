/**
 * Created with IntelliJ IDEA.
 * User: Joshua Hall
 * Date: 1/13/14
 * Time: 3:05 PM
 * To change this template use File | Settings | File Templates.
 */
public class CustomStack {
    Node top = null;

    public void push(Object item){

         if (item != null){
            Node newTop = new Node((Integer)item);   //create a new node which will be the top
            newTop.next = top;  //make the next item of the new top the old top
            top = newTop;      //make it the new top
         }

    }

    public Object pop(){

        if (top != null){
            Object item = top.data;  //save the top item
            top = top.next; //move to the next item   (delete it)
            return item;
        }
        return null;
    }

    public Object peek(){
        return top.data;
    }
}
