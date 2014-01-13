import java.util.LinkedList;

/**
 * Created with IntelliJ IDEA.
 * User: Joshua Hall
 * Date: 1/13/14
 * Time: 11:02 AM
 * To change this template use File | Settings | File Templates.
 */
public class Main {

    public static void main(String[] args){

        Node linkedList = new Node(2);

        linkedList.appendToTail(3);
        linkedList.appendToTail(4);


//        while (linkedList.next != null){
//            System.out.println(linkedList.data);
//            linkedList = linkedList.next;
//        }
//        if (linkedList.next == null){
//            System.out.println(linkedList.data);
//        }

        Node test = linkedList.deleteNode(linkedList, 3);

        while(test.next != null){
            System.out.println(test.data);
            test = test.next;
        }
        if (test.next == null){
            System.out.print(test.data);
        }
    }
}
