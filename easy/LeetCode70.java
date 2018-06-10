
public class LeetCode70 {
	//fibonacci sequence
	//time limit exceeded
	public int climbStairs(int n) {
        if(n==1)return 1;
        if(n==2)return 2;
        return climbStairs(n-1)+climbStairs(n-2);
    }
	//dynamic programming...
	public int climbStairs1(int n) {
		int num[] = new int[n+1];
		num[0]= 1;
		num[1]= 1;
		for(int i=2; i<=n; i++) {
			num[i]= num[i-1]+num[i-2];
		}
		return num[n];
	}
	public int climbStairs2(int n) {
		int m[] = new int[n+1];
		return fib(0,n,m);
	}
	private int fib(int i, int n, int[] m) {
		if(i>n)return 0;
		if(i==n)return 1;
		if(m[i]>0)return m[i];
		m[i] = fib(i+1,n,m)+fib(i+2,n,m);
		return m[i];
	}
}
