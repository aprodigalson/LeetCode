import java.util.HashSet;
import java.util.Set;

public class LeetCode202 {
	public boolean isHappy(int n) {
		int temp = n;
		Set<Integer> set = new HashSet<>();
		set.add(temp);
		while(temp!=1) {
			int l = temp;
			int newN = 0;
			while(l!=0) {
				newN = newN+(l%10)*(l%10);
				l/=10;
			}
			if(set.contains(newN))
				return false;
			else {
				set.add(newN);
				temp = newN;
			}
		}
		return true;
    }
}
