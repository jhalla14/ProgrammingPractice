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

        Node list = new Node(2);

        list.appendToTail(3);
        list.appendToTail(4);

        while (list.next != null){
            System.out.println(list.data);
            list = list.next;
        }
        if (list.next == null){
            System.out.println(list.data);
        }
    }
}
