
public class LeetCode35 {
	public int searchInsert(int[] nums, int target) {
        int low = 0;
        int high = nums.length-1;
        while(low<high) {
        	int mid = low+(high-low)/2;
        	if(nums[mid]<target) {
        		low = mid+1;
        	}else if(nums[mid]>target) {
        		high = mid-1;
        	}else {
        		return mid;
        	}
        }
        if(nums[low]>=target) {//if only one elements in nums,and it equals to target
        	return low;
        }else {
        	return low+1;
        }
    }
}
