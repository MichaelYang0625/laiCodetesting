package tree;


import java.util.ArrayList;
import java.util.List;

public class PreOrder extends TreeHelper {
    public List<Integer> preOrder(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        helper(root, res);
        return res;
    }
    private void helper(TreeNode root, List<Integer> res){
        if(root == null){
            return;
        }
        res.add(root.key);
        helper(root.left, res);
        helper(root.right, res);
    }

//    public static class TreeNode {
//        public int key;
//        public TreeNode left;
//        public TreeNode right;
//        public TreeNode(int key) {
//            this.key = key;
//        }
//    }

}
