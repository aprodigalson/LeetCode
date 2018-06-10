
public class LeetCode14 {
	public static String longestCommonPrefix(String[] strs) {
        StringBuilder string = new StringBuilder(strs[0]);
        for(int i=1; i<strs.length; i++) {
        	System.out.println(string);
        	int k=0;
        	for(int j=0; j<string.length() && j<strs[i].length(); j++) {
        		if(strs[i].charAt(j)==string.charAt(j)) {
        			k++;
        		}else {
        			
        		}
        	}
        	System.out.println(k);
        	string = string.delete(k, string.length());
        }
        return string.toString();
    }
	public static void main(String[]args) {
		String[] a= {"flower","flow","flight"};
		System.out.println(longestCommonPrefix(a));
		System.out.println("test");
	}
}
