

public class LeetCode155 {
	//every node contains a min value,which is min value of the list after the node;
	//very interesting thought
	private Node head;
    public void push(int x) {
    	if(head==null) {
    		head = new Node(x,x,null);
    	}else {
    		head = new Node(x, Math.min(x,head.min),head);
    	}
    }
    
    public void pop() {
       head=head.next;
    }
    
    public int top() {
    	return head.val;
    }
    
    public int getMin() {
    	return head.min;
    }
    class Node{
    	int val;
    	int min;
    	Node next;
    	Node(int v,int m,Node next){
    		this.val = v;
    		this.min = m;
    		this.next = next;
    	}
    }
}
