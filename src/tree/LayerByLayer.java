package tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LayerByLayer extends TreeHelper{
    public List<List<Integer>> layerByLayer(TreeNode root) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        //corner case
        if(root == null) {
            return list;
        }

        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            //the list storing all the nodes in the current level
            List<Integer> curLayer = new ArrayList<Integer>();
            //the size of current level
            int size = queue.size();

            for (int i = 0; i < size; i++) {
                TreeNode cur = queue.poll();
                curLayer.add(cur.key);

                if (cur.left != null) {
                    queue.offer(cur.left);
                }

                if (cur.right != null) {
                    queue.offer(cur.right);
                }
            }

            list.add(curLayer);
        }

        return list;
    }
}
