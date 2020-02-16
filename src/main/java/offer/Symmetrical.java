package offer;

/**
 * 对称的二叉树
 */
public class Symmetrical {
    boolean isSymmetrical(TreeNode pRoot) {
        if (pRoot == null) {
            return true;
        }
        return isSymmetrical(pRoot.left, pRoot.right);
    }

    private boolean isSymmetrical(TreeNode t1, TreeNode t2) {
        if (t1 == null && t2 == null) {
            return true;
        }
        if (t1 == null || t2 == null) {
            return false;
        }
        if (t1.mData != t2.mData) {
            return false;
        }
        return isSymmetrical(t1.left, t2.right) && isSymmetrical(t1.left, t2.left);
    }
}
