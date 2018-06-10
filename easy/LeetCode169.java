import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LeetCode169 {
	//o(nlogn)
	public int majorityElement(int[] nums) {
	        Arrays.sort(nums);
	        return nums[nums.length/2];
    }
	//o(n)
	public int majorityElement1(int[] nums) {
		Map<Integer,Integer> map = new HashMap<>();
		for(int n:nums) {
			if(map.containsKey(n)) {
				map.put(n, map.get(n)+1);
			}else {
				map.put(n, 1);
			}
		}
		Map.Entry<Integer, Integer> majority = null;
		//iterate map ,get the greatest value;
		for(Map.Entry<Integer, Integer> entry:map.entrySet()) {
			if(majority==null||entry.getValue()>majority.getValue()) {
				majority = entry;
			}
		}
		return majority.getKey();
	}
}
