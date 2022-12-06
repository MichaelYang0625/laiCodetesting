package tree;

public class treeMain {

    public static void main(String[] args) {
        //Preorder
        PreOrder pre = new PreOrder();
        //Inorder
        InOrder ino = new InOrder();
        //Postorder
        PostOrder post = new PostOrder();

        //Height
        Height height = new Height();
        //CountNodes
        CountNodes nodes = new CountNodes();
        //check Balance?
        CheckIfBalance checkIfBalance = new CheckIfBalance();
        //print layer by layer
        LayerByLayer layerByLayer = new LayerByLayer();
        //check complete?
        CheckCompleted checkCompleted = new CheckCompleted();

        PreOrder.TreeNode root = new PreOrder.TreeNode(5);
        root.left = new PreOrder.TreeNode(3);
        root.left.left = new PreOrder.TreeNode(1);
        root.left.right = new PreOrder.TreeNode(4);
        root.right = new PreOrder.TreeNode(8);
        //root.right.left = new TreeHelper.TreeNode(2);
        root.right.right = new PreOrder.TreeNode(11);


        System.out.println("Preorder traverse:  " + pre.preOrder(root));
        System.out.println("Inorder traverse:   " + ino.InOrder(root));
        System.out.println("Postorder traverse: " + post.PostOrder(root));

        System.out.println("The height of this tree is: " + height.findHeight(root));
        System.out.println("The number of nodes of this tree is: " + nodes.countNodes(root));

        if(!checkIfBalance.isBalanced(root)) {
            System.out.println("This binary tree is not balanced.");
        }else {
            System.out.println("This binary tree is balanced.");
        }

        System.out.println("Layer by layer print: " + layerByLayer.layerByLayer(root));

        if(!checkCompleted.isCompleted(root)) {
            System.out.println("This binary tree is not completed.");
        }else {
            System.out.println("This binary tree is completed.");
        }



    }

}
