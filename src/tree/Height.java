package tree;

public class Height extends TreeHelper{
    public int findHeight(TreeNode root) {
        if(root == null) {
            return 0;
        }

        int result = Math.max(findHeight(root.left), findHeight(root.right)) + 1;
        return result;
    }
}
