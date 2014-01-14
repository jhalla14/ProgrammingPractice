import java.util.LinkedList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Joshua Hall
 * Date: 1/13/14
 * Time: 11:02 AM
 * To change this template use File | Settings | File Templates.
 */
public class Main {

    public static void main(String[] args){

//        System.out.println(factorial(5));
        fibonacci(1513492384);
    }

    public static List fibonacci(Integer limit){
        Integer firstTerm = 1;
        Integer secondTerm = 1;
        Integer fib =  0;
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.add(firstTerm);
        list.add(secondTerm);

        while(fib < limit){
            fib = firstTerm + secondTerm;
            if (fib < limit) list.add(fib);

            firstTerm = secondTerm; //first term is now the second term
            secondTerm = fib; //second term becomes the most recent fibonacci number
        }

        System.out.println(list);

        return list;
    }

    public static Integer factorial(Integer number){
        if (number == 1){
            return 1;
        }

        return  number*factorial(number-1);

    }


    public Boolean isPalindrome(Integer number){




        return false;
    }
}
