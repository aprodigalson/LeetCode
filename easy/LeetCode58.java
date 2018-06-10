
public class LeetCode58 {
	public int lengthOfLastWord(String s) {
		if(s.length()==0) {
			return 0;
		}
		s = s.trim();
        int indexofSpace = s.lastIndexOf(' ');
        if(indexofSpace == -1) {
        	return s.length();
        }else {
        	return s.length() - indexofSpace-1;
        }
    }
}
