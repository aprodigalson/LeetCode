
public class LeetCode112 {
	//sum may be less than 0
	//the last node on path must be leaf
	public boolean hasPathSum(TreeNode root, int sum) {
        if(root==null )return false;
        if(root.val==sum && root.left==null && root.right==null)
        	return true;
        else
        	return hasPathSum(root.left,sum-root.val) || hasPathSum(root.right,sum-root.val);
    }
	class TreeNode{
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x){
			val = x;
		}
	}
}
