package tree;

import java.util.ArrayList;
import java.util.List;

public class PostOrder extends TreeHelper {

    public List<Integer> PostOrder(TreeNode root){
        List<Integer> res = new ArrayList<>();
        helper(root, res);
        return res;
    }

    private void helper(TreeNode root, List<Integer> res) {
        if(root == null) {
            return;
        }

        helper(root.left, res);
        helper(root.right, res);
        res.add(root.key);
    }
}
