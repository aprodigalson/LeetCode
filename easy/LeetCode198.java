
public class LeetCode198 {
	public int rob(int[] nums) {
		//easy dp 
        if(nums.length==0||nums==null)return 0;
        int len = nums.length;
        if(len==1)
        	return nums[0];
        if(len==2)
        	return Math.max(nums[1], nums[0]);
        int[] dp = new int[len];
        for(int i=0; i<len; i++) {
        	if(i==0) {
        		dp[i]=nums[i];
        	}else if(i==1){
        		dp[i] = Math.max(nums[i], nums[i-1]);
        	}else {
        		dp[i] = Math.max(dp[i-1], dp[i-2]+nums[i]);
        	}
        }
        return dp[len-1]>dp[len-2]?dp[len-1]:dp[len-2];
    }
}
