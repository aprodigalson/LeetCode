
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LeetCode501 {
	//put node into a map <node.val,number of value>
	public int[] findMode(TreeNode root) {
        Map<Integer, Integer> map = new HashMap<>();
		inorder(map,root);
		int max = 0;
		for(Integer i:map.keySet()) {
			if(map.get(i)>max) {
				max = map.get(i);
			}
		}
		List<Integer> list = new ArrayList<>();
		for(Integer i:map.keySet()) {
			if(map.get(i)==max){
				list.add(i);
			}
		}
		int[] r = new int[list.size()];
		for(int i=0; i<list.size(); i++) {
			r[i] = list.get(i);
		}
		return r;
    }
	private void inorder(Map<Integer,Integer> map,TreeNode root) {
		if(root!=null) {
			inorder(map,root.left);
			if(map.containsKey(root.val)) {
				map.put(root.val, map.get(root.val)+1);
			}else {
				map.put(root.val, 1);
			}
			inorder(map,root.right);
		}
	}
	
	
	class TreeNode{
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x){this.val = x;}
	}
}
