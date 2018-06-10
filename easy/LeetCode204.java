import java.util.ArrayList;
import java.util.List;

public class LeetCode204 {
	//tle:499979
	public int countPrimes(int n) {
		List<Integer> list = new ArrayList<>();
		int r=0;
        for(int i=2; i<n; i++) {
        	if(isPrimes(i,list)) {
        		list.add(i);
        		r++;
        	}	
        }
        return r;
    }
	public boolean isPrimes(int n,List<Integer> list) {
		for(int i:list) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}
	// boolean[] is initialize false
	public int countPrimes1(int n) {
		boolean[] flag = new boolean[n];//can't bigger array
		for(int i=2; i*i<n;i++) {
			if(flag[i]) {
				for(int j=i; i*j<n; j++) {//i*j may out of range
					flag[i*j] = true;
				}
			}
		}
		int res = 0;
		for(int i=2; i<flag.length; i++) {
			if(!flag[i]) {
				res++;
			}
		}
		return res;
	}
}
