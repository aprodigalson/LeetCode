import java.util.HashSet;
import java.util.Set;

public class LeetCode160 {
	//brute force ; time limit exceeded
	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode tempA = headA;
        ListNode tempB = headB;
        while(tempA!=null) {
        	if(tempB==null) {
        		tempA=tempA.next;
        		tempB=headB;
        		continue;
        	}
        	if(tempA==tempB) {
        		return tempA;
        	}
        	tempB=tempB.next;
        }
        return null;
    }
	public ListNode getIntersectionNode1(ListNode headA, ListNode headB) {
		Set<ListNode> set = new HashSet<>();
		while(headA!=null) {
			set.add(headA);
			headA = headA.next;
		}
		while(headB!=null) {
			if(set.contains(headB)) {
				return headB;
			}
			headB=headB.next;
		}
		return null;
	}
	class ListNode{
		int val;
		ListNode next;
		ListNode(int v){val=v;next=null;}
	}
}
