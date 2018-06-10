
public class LeetCode26 {
	public int removeDuplicates(int[] nums) {
		//double pointer 
		//one  i is used to put new value, another  j is used to iterate
		if(nums.length==0){
			return 0;
		}
		int i = 0;
        for(int j=1; j<nums.length; j++){
        	if(nums[i]!=nums[j]){
        		nums[i++] = nums[j];
        	}
        }
        return i+1;
    }
}
