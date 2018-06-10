
public class LeetCode191 {
	public int hammingWeight(int n) {
        int result = 0;
        for(int i=0; i<32; i++) {
        	int temp = n&1;
        	if(temp==1)
        		result++;
        	n>>>=1;
        	
        }
        return result;
    }
	// the same as upper method 
	public int hammingWeight1(int n) {
		int result = 0; 
		int mask = 1;
		for(int i=0; i<32; i++) {
			if((n&mask)==1)
				result++;
			mask<<=1;
		}
		return result;
	}
	//00000100001000&
	//00000100000111  !x=0;
	public int hammingWeight2(int n) {
		int result = 0;
		while(n!=0) {
			result++;
			n&=(n-1);
		}
		return result;
	}
}
