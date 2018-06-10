
public class LeetCode83 {
	public ListNode deleteDuplicates(ListNode head) {
		ListNode tmp = head;
		if(head==null) {
			return null;
		}
		while(tmp.next!=null) {
				if(tmp.val==tmp.next.val) {
					tmp.next = tmp.next.next;
				}else {
					tmp = tmp.next;
				}
		}
		return head;
    }
	class ListNode{
		int val;
		ListNode next;
		ListNode(int x){val = x;}
	}
}
