
public class LeetCode171 {
	public int titleToNumber(String s) {
        int res = 0;
        for(int i=0; i<s.length(); i++) {
        	char temp = s.charAt(i);
        	res = res*26+temp-'A'+1;
        }
        return res;
    }
}
