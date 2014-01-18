import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

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
//        fibonacci(1513492384);

//        CustomBinaryTree tree = new CustomBinaryTree();
//
//        tree.insert(3);
//        tree.insert(2);
//        tree.insert(5);
//        tree.insert(10);
//        tree.insert(15);
//        tree.insert(100);
//        tree.insert(-1);
//
//
//
//        System.out.println(tree);
//
//        boolean[] set = new boolean[10];
//
//        System.out.println(set.length);
//        for (int i=0; i<=set.length-1; i++){
//            System.out.println(set[i]);
//        }

//        System.out.println(hasUniqueCharactersInString("Palantir"));
        System.out.println(isStringPermutationOfString("palanTir", "Tirpalan"));

    }

    public static Boolean isStringPermutationOfString(String alpha, String beta){
        char[] alphaCharArray = alpha.toCharArray();
        char[] betaCharArray = beta.toCharArray();

        if (alphaCharArray.length != betaCharArray.length) return false;
        Map<Character, Integer> alphaMap = buildMap(alpha);
        Map<Character, Integer> betaMap = buildMap(beta);

        for (int i=0; i<=alphaCharArray.length-1; i++){
            if (betaMap.containsKey(alphaCharArray[i])){
                if (!(betaMap.get(alphaCharArray[i]) == alphaMap.get(alphaCharArray[i]))){
                    return false;
                }
            } else {
                return false;
            }

        }



        return true;
    }

    private static Map<Character, Integer> buildMap(String input){
        if (input == null){
            System.err.println("Input string is null");
            return null;
        }

        char[] inputCharArray = input.toCharArray();
        Map<Character, Integer> map = new HashMap<Character, Integer>();

        for (int i=0; i<=inputCharArray.length-1; i++){
            if (map.containsKey(inputCharArray[i])){
                map.put(inputCharArray[i], map.get(inputCharArray[i])+1);
            } else {
                map.put(inputCharArray[i], 1);
            }
        }



        return map;
    }

    public static Boolean hasUniqueCharactersInString(String string){

        char[] characters = string.toCharArray();

        for (int i=0; i<characters.length-1; i++){
            for (int j=i+1; j<=characters.length-1; j++){
                if (characters[i] == characters[j]){
                    return false;
                }
            }
        }

        return true;
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
