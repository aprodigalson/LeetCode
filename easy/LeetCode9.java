
public class LeetCode9 {
	public static boolean isPalindrome(int x) {
		//the same as question 7
		if(x<0) {
			return false;
		}
		int back = 0;
		int l = x;
		while(x>0) {
			int tmp = x%10;
			int res = back*10+tmp;
			if((res-tmp)/10!=back) {
				return false;
			}
			back = res;
			x /= 10;
		}
		return back==l;
    }
	public static void main(String[]args) {
		System.out.println(isPalindrome(121));
	}
}
