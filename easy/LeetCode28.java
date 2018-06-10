
public class LeetCode28 {
	//string match algorithm
	public int strStr(String haystack, String needle) {
        return haystack.indexOf(needle);
    }
	//brute force
	public static int bf(String haystack, String needle) {
		if(needle.length()==0) {//boundary condition 
			return 0;
		}
		for(int i=0; i<haystack.length(); i++) {
			if(haystack.charAt(i) == needle.charAt(0)) {
				if(compare(haystack, i, needle)) {
					return i;
				}
			}
		}
		return -1;
	}
	private static  boolean compare(String haystack, int index, String needle) {
		int count = 0;
		for(int i=0; i<needle.length() && index+i<haystack.length(); i++) {
			if(haystack.charAt(index+i) == needle.charAt(i)) {
				count++;
			}
		}
		if(count == needle.length()) {
			return true;
		}
		return false;
	}
	//kmp
	public int kmp(String haystack, String needle) {
		if(haystack==null || haystack.length()<needle.length()) {
			return -1;
		}
		if(needle.length()==0) {
			return 0;
		}
		int []next = calNext(needle);
		int hindex = 0;
		int nindex = 0;
		while(hindex < haystack.length() && nindex < needle.length()) {
			if(haystack.charAt(hindex)==needle.charAt(nindex)) {
				hindex++;
				nindex++;
			}else if(next[nindex]!=-1) {
				hindex++;
			}else {
				nindex=next[nindex];
			}
		}
		return nindex==needle.length()?hindex-nindex:-1;
	}
	//partial match table
	//字符串的前缀集合和后缀集合的交集中最长元素的长度
	//例："aba" 前缀：['a','ab'] , 后缀：['ba','a']
	
	private int[] calNext(String needle) {
		if(needle.length()==1) {
			return new int[] {-1};
		}
		int [] next = new int[needle.length()];
		next[0] = -1;
		next[1] = 0;
		int cn = 0; 
		int pos = 2;
		while(pos<next.length) {
			if(needle.charAt(pos-1) == needle.charAt(cn)) {
				next[pos++] = ++cn;
			}else if(cn>0) {
				cn = next[cn];
			}else {
				next[pos++] = 0;
			}
		}
		return next;
	}
}
