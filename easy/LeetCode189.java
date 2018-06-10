
public class LeetCode189 {
	//brute force
	public void rotate(int[] nums, int k) {
        int temp,pre;
        for(int i=0; i<k; i++) {
        	pre = nums[nums.length-1];
        	for(int j=0; j<nums.length; j++) {
        		temp = nums[j];
        		nums[j] = pre;
        		pre = temp;
        	}
        }
    }
	//o(n) space
	public void rotate1(int[] nums, int k) {
        int[] a = new int[nums.length];
        for(int i=0; i<nums.length; i++) {
        	a[(i+k)%nums.length] = nums[i];
        }
        for(int i=0; i<nums.length; i++) {
        	nums[i] = a[i];
        }
    }
	
	public void rotate2(int[] nums, int k) {
		k = k%nums.length;
		int count = 0;
		for(int start = 0; count<nums.length; start++) {
			int current = start;
			int pre = nums[start];
			do {
				int next = (current+k)%nums.length;
				int temp = nums[next];
				nums[next] = pre;
				pre = temp;
				current = next;
				count++;
			}while(start!=current);
		}
	}
	//interesting thought
	public void rotate3(int[] nums, int k) {
		k%=nums.length;
		reverse(nums,0,nums.length-1);
		reverse(nums,0,k-1);
		reverse(nums,k,nums.length-1);
		
	}
	private static void reverse(int[] nums,int start,int end) {
		while(start<end) {
			int temp = nums[start];
			nums[start] = nums[end];
			nums[end] = temp;
			start++;
			end--;
		}
	}
}
