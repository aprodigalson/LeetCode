/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class LeetCode100 {
	public boolean isSameTree(TreeNode p, TreeNode q) {
		 //beautify code
		//if(p==null&&q==null)return true;
		//if(p==null || q==null)return false;
		//bad code
        if(p==null&&q==null) {
        	return true;
        }else if(p!=null&&q==null) {
        	return false;
        }else if(p==null&&q!=null) {
        	return false;
        }else {
        	if(p.val==q.val) {
        		return isSameTree(p.left, q.left) && isSameTree(p.right,q.right);
        	}
        }
        return false;
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
