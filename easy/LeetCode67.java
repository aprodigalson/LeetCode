
public class LeetCode67 {
	//my stupid code 
	public static String addBinary(String a, String b) {
		int len =0;
		if(a.length()>b.length()) {
			StringBuilder s = new StringBuilder();
			for(int i=0; i<a.length()-b.length(); i++) {
				s.append("0");
			}
			s.append(b);
			b=s.toString();
		}
		if(a.length()<b.length()){
			StringBuilder s = new StringBuilder();
			for(int i=0; i<b.length()-a.length(); i++) {
				s.append("0");
			}
			s.append(a);
			a=s.toString();
		}
		len =a.length();
        StringBuilder res = new StringBuilder();
        int flag = 0;
        for(int i=len-1; i>=0; i--) {
        	if(a.charAt(i)=='0' && b.charAt(i)=='0'&& flag==0) {
        		flag = 0;
        		res.insert(0, '0');
        	}else if(a.charAt(i)=='0' && b.charAt(i)=='0'&& flag==1) {
        		flag = 0;
        		res.insert(0, '1');
        	}else if(a.charAt(i)=='0' && b.charAt(i)=='1' && flag==0) {
        		flag = 0;
        		res.insert(0, '1');
        	}else if(a.charAt(i)=='0' && b.charAt(i)=='1' &&flag==1) {
        		flag = 1;
        		res.insert(0, '0');
        	}else if(a.charAt(i)=='1' && b.charAt(i)=='0' &&flag==0) {
        		flag = 0;
        		res.insert(0, '1');
        	}else if(a.charAt(i)=='1' && b.charAt(i)=='0'&&flag==1) {
        		flag = 1;
        		res.insert(0, '0');
        	}else if(a.charAt(i)=='1' && b.charAt(i)=='1' && flag==0) {
        		flag = 1;
        		res.insert(0, '0');
        	}else if(a.charAt(i)=='1' && b.charAt(i)=='1' && flag==1) {
        		flag = 1;
        		res.insert(0, '1');
        	}
        }
        if(flag==1) {
        	res.insert(0, '1');
        }
        return res.toString();
    }
	public String addBinary1(String a,String b) {
		StringBuilder sb = new StringBuilder();
		int i = a.length()-1;
		int j = b.length()-1;
		int carry = 0;
		while(i>=0||j>=0) {
			int sum = carry;
			if(j>=0)sum+=b.charAt(j--)-'0';
			if(i>=0)sum+=a.charAt(i--)-'0';
			sb.append(sum%2);
			carry = sum/2;
		}
		if(carry!=0) {
			sb.append(carry);
		}
		return sb.reverse().toString();
		
	}
}
