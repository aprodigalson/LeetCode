
public class Leetcode7 {
	public int reverse(int x) {
		//pay attention to the border value,
		//reserved number may out of 32bit Integer range
		//if out of range,by go back to compute whether 
		//result can go back to judge whether out of range
        int result = 0;
        boolean flag = false;
        if(x<0) {
        	x = -x;
        	flag = true;
        }
        while(x>0) {
        	int tmp = x%10;
        	int res = result*10+tmp;
        	if((res-tmp)/10!=result){
        		return 0;
        	}
        	result = res;
        	x = x/10;
        }
        if(flag) {
        	return -result;
        }
        return result;
    }
}
