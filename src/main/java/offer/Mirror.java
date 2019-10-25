package offer;

/**
 * 二叉树的镜像
 */
public class Mirror {
    public void mirror(TreeNode root){
        if (root ==null){
            return;
        }
        swap(root);
        mirror(root.getLeft());
        mirror(root.getRight());
    }
    private void swap(TreeNode root){
        TreeNode t = root.left;
        root.left=root.right;
        root.right = t;
    }
}
