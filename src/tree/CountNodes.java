package tree;

public class CountNodes extends TreeHelper{

    public int countNodes(TreeNode root) {
        if(root == null) {
            return 0;
        }

        int leftNodes = countNodes(root.left);
        int rightNodes = countNodes(root.right);
        int result = leftNodes + rightNodes + 1;
        return result;
    }
}
