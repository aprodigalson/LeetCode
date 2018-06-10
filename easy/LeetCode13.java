
public class LeetCode13 {
	//pay attention to detail
	public int romanToInt(String s) {
        char[] c = s.toCharArray();
        int result = 0;
        for(int i=0; i<c.length; i++) {
        	if(i>=1 && getValue(c[i])>getValue(c[i-1])) {
        		result -= 2*getValue(c[i-1]);
        	}
        	result+=getValue(c[i]);
        }
        return result;
    }
	private static int getValue(char c) {
		switch(c) {
		case 'I':
			return 1;
		case 'V':
			return 5;
		case 'X':
			return 10;
		case 'L':
			return 50;
		case 'C':
			return 100;
		case 'D':
			return 500;
		case 'M':
			return 1000;
		}
		return 0;
	}
}
