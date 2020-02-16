package offer;

public class TreeNode {
    // 存储的数据
    public Object mData;
    // 父亲节点的下标
    private int mParent;

    public TreeNode left;
    public TreeNode right;

    public TreeNode(Object mData) {
        this.mData = mData;
        this.left = null;
        this.right = null;
    }

    public void setLeft(TreeNode left) {
        this.left = left;
    }

    public void setRight(TreeNode right) {
        this.right = right;
    }

    public TreeNode getLeft() {
        return left;
    }

    public TreeNode getRight() {
        return right;
    }


    public TreeNode(TreeNode left, TreeNode right) {
        this.right = right;
        this.left = left;
    }

    public TreeNode(Object data, int parent) {
        this.mData = data;
        this.mParent = parent;
    }

    public Object getmData() {
        return mData;
    }

    public int getmParent() {
        return mParent;
    }

    public void setmData(Object mData) {
        this.mData = mData;
    }

    public void setmParent(int mParent) {
        this.mParent = mParent;
    }
}
