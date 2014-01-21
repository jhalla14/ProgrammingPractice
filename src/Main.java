import com.sun.corba.se.impl.orbutil.graph.GraphImpl;
import com.sun.corba.se.impl.orbutil.graph.NodeData;
import sun.tools.tree.*;
import sun.tools.tree.Node;

import java.util.*;

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
//        System.out.println(isStringPermutationOfString("palanTir", "Tirpalan"));
//          System.out.println(replaceWhiteSpace("Mr John Smith   ", 13));

//        char[][] board = new char[4][4];
//        board[0][0] = 'a';
//        board[0][1] = 'b';
//        board[0][2] = 'c';
//        board[0][3] = 'd';
//        board[1][0] = 'e';
//        board[1][1] = 'f';
//        board[1][2] = 'g';
//        board[1][3] = 'h';
//        board[2][0] = 'i';
//        board[2][1] = 'j';
//        board[2][2] = 'k';
//        board[2][3] = 'l';
//        board[3][0] = 'm';
//        board[3][1] = 'n';
//        board[3][2] = 'o';
//        board[3][3] = 'p';
//
//         List<Character> list = findAllWords(board);

//        System.out.println(isPalindrome("amanaplanacanalpanama"));

//        Integer[] array = new Integer[5];
//        array[0] = 10;
//        array[1] = 5;
//        array[2] = 6;
//        array[3] = 2;
//        array[4] = 3;
//
//        Integer[] sortedArray =  bubbleSort(array);
//
//        for (int i=0; i<=sortedArray.length-1;i++){
//            System.out.println(sortedArray[i]);
//        }
    }
    public static Integer[] bubbleSort(Integer[] array){
        if (array == null) return null;
        int length = array.length;
        int firstNumber;
        int secondNumber;
        for (int comparisons = 0; comparisons <= length - 1; comparisons++) {
            for (int i = 0; i <= length - 1; i++) {
                firstNumber = array[i];

                if (i + 1 <= length - 1) {
                    secondNumber = array[i + 1];
                    if (firstNumber > secondNumber) {
                        array[i] = secondNumber;
                        array[i + 1] = firstNumber;
                    }
                }
            }
        }



        return array;
    }

    public static List<Character> findAllWords(char[][] board){
        int length = board.length;
        Set<Set<Character>> horiztonalSets = new HashSet<Set<Character>>();
        Set<Set<Character>> verticalSets = new HashSet<Set<Character>>();
        Set<Set<Character>> diagonalSets = new HashSet<Set<Character>>();


        for (int i=0; i<=length-1;i++){
           for (int j=0; j<=length-1; j++){
               int counter = 0;
               Set<Character> horizontalSet = new HashSet<Character>();
               Set<Character> verticalSet = new HashSet<Character>();
               Set<Character> diagonalSet = new HashSet<Character>();
               while (counter <= length-1){
                   if (i+counter <= length-1 && j+counter <=length-1){
                       horizontalSet.add(board[i][j + counter]);
                       verticalSet.add(board[i+counter][j]);
                       diagonalSet.add(board[i+counter][j+counter]);

                       horiztonalSets.add(horizontalSet);
                       verticalSets.add(verticalSet);
                       diagonalSets.add(diagonalSet);
                   }
                   counter++;
               }
           }
        }

        System.out.println(horiztonalSets);
        System.out.println(verticalSets);
        System.out.println(diagonalSets);


       return null;
    }

    public static String replaceWhiteSpace(String input, int length){
        if (input == null) return null;

        char[] inputCharArray = input.trim().toCharArray();

        int whiteSpaceCounter = 0;
        for (int i=0; i<=inputCharArray.length-1; i++){
           if (inputCharArray[i] == ' '){
               whiteSpaceCounter++;
           }
        }

        System.out.println(whiteSpaceCounter);
        int newLength = length + (whiteSpaceCounter * 3);
        System.out.println(newLength);

        char[] output = new char[newLength];
        int outputCounter = 0;
        for (int i=0; i<=inputCharArray.length-1; i++){

            if (inputCharArray[i] == ' '){
                output[i] = '%';
                output[i+1] = '2';
                output[i+2] = '0';
                outputCounter += 3;
            } else {

             output[outputCounter + 1] = inputCharArray[i];
             outputCounter +=1;

            }

        }

        for (int i=0; i<=output.length-1; i++){
            System.out.println(output[i]);
        }

        return output.toString();
    }

    public static Boolean isStringPermutationOfString(String alpha, String beta){

        if (alpha == null || beta == null){
            System.err.println("Check method parameters of null value");
            return null;
        }

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


    public static Boolean isPalindrome(String string){
        if (string == null){
            System.err.println("Input string is null");
            return false;
        }
        char[] charArray = string.toCharArray();
        int length = charArray.length;
        int midpoint;

        Stack<Character> stack = new Stack<Character>();

        if (length % 2 == 0){
            midpoint = (length-1)/2;
            System.out.println(midpoint);
            for (int i=0; i<=midpoint;i++){
                stack.push(charArray[i]);
            }
            for (int j=midpoint+1; j<=length-1; j++){
                if (!(stack.pop() == charArray[j])){
                    return false;
                }
            }
        } else {
            midpoint = length/2;
            System.out.println(midpoint);
            for (int i=0; i<midpoint;i++){
                stack.push(charArray[i]);
            }

            for (int j=midpoint+1; j<=length-1; j++){
                if (!(stack.pop() == charArray[j])){
                    return false;
                }
            }
        }

        return true;
    }


    public boolean verifyBoard(int[][] board){

        if (board == null) return false;

        ArrayList<Set<Integer>> list = new ArrayList<Set<Integer>>();

        for(int k=0; k<=list.size();k++){
            Set<Integer> boxSet = new HashSet<Integer>();
            list.add(boxSet);
        }

        for(int i=0; i<=board.length-1;i++){
            Set<Integer> horizontalSet = new HashSet<Integer>();
            Set<Integer> verticalSet = new HashSet<Integer>();

            for(int j=0; j<=board[0].length-1;j++){
                if(!(board[i][j] > 0 && board[i][j] <10)){
                    return false;
                }

                Set<Integer> currentBoxSet;
                currentBoxSet = list.get(Math.floor(i/3) + Math.floor(j/3)*3);

                if(currentBoxSet.contains(board[i][j])){
                    return false;
                } else {
                    currentBoxSet.add(board[i][j]);
                }

                if(horizontalSet.contains(board[i][j]){
                    return false;
                } else {
                    horizontalSet.add(board[i][j]);
                }

                if(verticalSet.contains(board[j][i]){
                    return false;
                } else {
                    verticalSet.add(board[j][i]);
                }

            }
        }



        return true;
    }

}
