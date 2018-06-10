
public class LeetCode203 {
	public ListNode removeElements(ListNode head, int val) {
        ListNode temp = head;
        ListNode pre = temp;
        if(head==null) 
        	return null;
        while(temp!=null) {
        	if(temp.val==val) {
        		if(temp==head) {
        			head=head.next;
        			temp = head;
        			pre = temp;
        			continue;
        		}
        		pre.next = temp.next;
        		temp = temp.next;
        	}else {
        		pre = temp;
        		temp = temp.next;
        	}
        }
        return head;
    }
	class ListNode{
		int val;
		ListNode next;
		ListNode(int val){this.val=val;}
	}
}
