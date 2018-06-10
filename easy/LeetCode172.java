
public class LeetCode172 {
	public int trailingZeroes(int n) {
		//the number of zero equals the number of 2 *5 
		//and the number of 5 is less than 2 ,so equals to the number of 5
        if(n<5) {
        	return 0;
        }
        int c = 0;
        while(n/5!=0) {
        	n /=5;
        	c += n;    	
        }
        return c;
    }
}
