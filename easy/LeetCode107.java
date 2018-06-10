import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class LeetCode107 {
	//bad code 
	public List<List<Integer>> levelOrderBottom(TreeNode root) {
		List<List<Integer>> list = new ArrayList<>();
		Queue<TreeNode> queue = new LinkedList<>();
		if(root==null) {
			return list;
		}
		queue.add(root);		
		while(!queue.isEmpty()) {
			List<TreeNode> l = new ArrayList<>();
			while(!queue.isEmpty()) {
				l.add(queue.poll());
			}
			for(TreeNode i :l) {
				if(i.left!=null)
					queue.add(i.left);
				if(i.right!=null)
					queue.add(i.right);
			}
			List<Integer> l1 = new ArrayList<>();
			for(TreeNode i :l) {
				l1.add(i.val);
			}
			list.add(l1);	
		}
		Stack<List<Integer>> stack = new Stack<>();	
		for(List<Integer> i : list) {
			stack.push(i);
		}
		List<List<Integer>> r =new ArrayList<>();
		while(!stack.isEmpty()) {
			r.add(stack.pop());
		}
		return r;
    }
	//the same as the upper code
	public List<List<Integer>> levelOrderBottom1(TreeNode root) {
		List<List<Integer>> list = new ArrayList<>();
		Queue<TreeNode> queue = new LinkedList<>();
		if(root==null) {
			return list;
		}
		queue.add(root);		
		while(!queue.isEmpty()) {
			List<Integer> l = new ArrayList<>();
			for(int i=0; i<queue.size(); i++) {
				TreeNode node = queue.poll();
				l.add(node.val);
				if(node.left!=null)queue.add(node.left);
				if(node.right!=null)queue.add(node.right);
			}
			list.add(0,l);
		}
		return list;
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
