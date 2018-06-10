
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

public class Leetcode653 {
	//wrong, why?
	public boolean findTarget(TreeNode root, int k) {
		//transfer bst into sorted list by inorder;
		if(root==null) {return false;}
		List<Integer> list = new ArrayList<>();
		int i=0,j=list.size()-1;
		while(i<j) {
			int sum = list.get(i)+list.get(j);
			if(sum==k) {
				return true;
			}else if(sum<k) {
				i++;
			}else {
				j--;
			}
		}
		return false;
	}	
	
	public boolean findTarget1(TreeNode root, int k) {
		//search a value in HashSet is O(1);
		//so this algorithm's time Complexity is O(n)
		//DFS, by recursion ,put all value into HashSet,
		Set<Integer> set = new HashSet<>();
		return find(root, k, set);
	}
	public boolean findTarget2(TreeNode root, int k) {
		//BFS, search a value in HashSet is O(1)
		Set<Integer> set = new HashSet<>();
		Queue<TreeNode> queue = new LinkedList<>();
		queue.add(root);
		while(!queue.isEmpty()) {
			if(queue.peek()!=null) {
				TreeNode node = queue.remove();
				if(set.contains(k-node.value)) {
					return true;
				}
				set.add(node.value);
				queue.add(node.right);
				queue.add(node.left);
			}else {
				queue.remove();
			}
		}
		return false;
		
	}
	private boolean find(TreeNode root, int k, Set<Integer>set) {
		if(root==null){
			return false;
		}
		if(set.contains(k-root.value)) {
			return true;
		}
		set.add(root.value);
		return find(root.left, k, set)|| find(root.right, k, set);
	}
	private void inorder(TreeNode root, List<Integer> list) {
		if(root==null) {
			return;
		}
		inorder(root.left, list);
		list.add(root.value);
		inorder(root.right, list);
	}
}
class TreeNode{
	int value;
	TreeNode left;
	TreeNode right;
	TreeNode(int x){this.value = x;} 
}