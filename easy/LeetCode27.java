
public class LeetCode27 {
	public int removeElement(int[] nums, int val) {
		//the same as leetcode 26 , two pointer 
        int j = 0;
        for(int i=0; i<nums.length; i++) {
        	if(nums[i]!=val) {
        		nums[j++] = nums[i];
        	}
        }
        return j;
    }
}
