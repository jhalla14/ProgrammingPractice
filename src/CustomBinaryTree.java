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

    public boolean lookUp(CustomNode node, Integer data){
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

    public void insert(Integer data){
       root = insert(root, data);
    }

    private CustomNode insert(CustomNode node, Integer data){
        //check if the tree is empty
        if (node == null){
            node = new CustomNode(data);
        } else {
           if (data <= node.data){
               node.left = insert(node.left, data);
           } else {
               node.right = insert(node.right, data);
           }
        }

        return node;
    }


    private static class CustomNode {
        Integer data;
        CustomNode left;
        CustomNode right;

        protected CustomNode(Integer data){
            this.data = data;
            left = null;
            right = null;
        }

    }
}
