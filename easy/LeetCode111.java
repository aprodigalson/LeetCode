import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LeetCode111 {
	//BFS ,bad thought
	public int minDepth(TreeNode root) {
        if(root==null)return 0;
        int depth = 1;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()) {
        	List<TreeNode> list = new ArrayList<>();
        	int size = queue.size();
        	for(int i=0; i<size; i++) {
        		TreeNode node = queue.poll();
        		list.add(node);
        	}
        	for(int i=0; i<size-1; i++) {
        		//if child is null ,don't put it child into queue
        		if(list.get(i).left!=null)
        			queue.add(list.get(i).left);
        		if(list.get(i).right!=null)
        			queue.add(list.get(i).right);
        		if(list.get(i).left==null && list.get(i).right==null) {
        			return depth;
        		}
        	}
        	depth++;
        }
        return depth;
    }
	//recursive
	public int minDepth1(TreeNode root) {
		if(root == null)return 0;
		int left = minDepth1(root.left);
		int right = minDepth1(root.right);
		return (left == 0||right==0)?left+right+1:Math.min(left, right)+1;
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
