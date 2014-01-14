/**
 * Created with IntelliJ IDEA.
 * User: Joshua Hall
 * Date: 1/14/14
 * Time: 12:30 PM
 * To change this template use File | Settings | File Templates.
 */
public class CustomBinaryTree {

    private CustomNode root;



    private void CustomBinaryTree(){
        root = null;
    }

    private boolean lookUp(CustomNode node, Integer data){
        if (node == null){
            return false;
        }

        if (node.data == data){
            return true;
        } else if (node.data < data){
          return lookUp(node.left, data);
        } else {
            return lookUp(node.right, data);
        }
    }

    private void insert(CustomNode node){

    }


    private static class CustomNode {
        Integer data;
        CustomNode left;
        CustomNode right;

        private CustomNode(Integer data){
            this.data = data;
            left = null;
            right = null;
        }

    }
}
