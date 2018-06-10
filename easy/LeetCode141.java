import java.util.HashSet;
import java.util.Set;
public class LeetCode141 {
	//hashtable
	public boolean hasCycle(ListNode head) {
        Set<ListNode> set = new HashSet<>();
        while(head!=null){
            if(set.contains(head)){
                return true;
            }else{
                set.add(head);
            }
            head = head.next;
        }
        return false;
    }
	//two pointer, one is fast and another is slow
	public boolean hasCycle1(ListNode head) {
		if(head==null||head.next==null) {
			return false;
		}
		ListNode slow = head;
		ListNode fast = head.next;
		while(slow!=fast) {
			if(fast==null||fast.next==null) {
				return false;
			}
			slow = slow.next;
			fast = fast.next.next;
		}
		return true;
	}
	
	class ListNode{
		int val;
		ListNode next;
		ListNode(int v){val=v;}
	}
}
