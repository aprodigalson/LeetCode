
public class LeetCode38 {
	public static String countAndSay(int n) {
		if(n<=0) {
			return null;
		}
		String s = "1";
        while(n>1) {
        	s = Count(s);
        	n--;
        }
        return s;
    }
	//if a circle cann't solve the boundary condition, initialize a temple variable
	private static String Count(String s) {
		StringBuilder str = new StringBuilder();
		int count = 1;
		char temp = s.charAt(0);//temple variable to solve the boundary condition;
		for(int i=1; i<s.length(); i++) {
			if(s.charAt(i)!=temp) {
				str.append(count).append(temp);
				count = 1;
				temp = s.charAt(i);
			}else {
				count++;
			}
		}
		str.append(count).append(temp);
		return str.toString();
	}
}
