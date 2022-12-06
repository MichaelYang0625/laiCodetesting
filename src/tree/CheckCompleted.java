package tree;

import java.util.LinkedList;
import java.util.Queue;

public class CheckCompleted extends TreeHelper{
    public boolean isCompleted(TreeNode root) {
        //corner case
        if (root == null) {
            return true;
        }

        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        boolean flag = false; //use flag to record : 是否遇到过气泡，一旦遇到过，后面不能再出现有value的node
        queue.offer(root);

        while (!queue.isEmpty()) {
            TreeNode cur = queue.poll();

            if (cur.left == null) {
                flag = true;
            } else if (flag) {
                return false;
            } else {
                queue.offer(cur.left);
            }

            if (cur.right == null) {
                flag = true;
            } else if (flag) {
                return false;
            } else {
                queue.offer(cur.right);
            }
        }

        return true;
    }
}
