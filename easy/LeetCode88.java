
public class LeetCode88 {
	public void merge(int[] nums1, int m, int[] nums2, int n) {
		//the same as leetcode 26
		//there are some pointer,one is used to mark the index of array to put the value of the other pointer point to 
        int k = m+n-1;
        int i = m-1;
        int j = n-1;
        while(k>=0){
        	if(i<0) {
        		nums1[k--] = nums2[j--];
        		continue;
        	}
        	if(j<0) {
        		break;
        	}
        	if(nums1[i]>nums2[j]) {
        		nums1[k--] = nums1[i--];
        	}else {
        		nums1[k--] = nums2[j--];
        	}
        }
    }
}
