
public class LeetCode69 {
	//brute force ,time limited exceed, wrong 
	//not tle , i*i has out of Integer range...
	//use long or don't use multiply
	public int mySqrt(int x) {
        if(x==0||x==1){
            return x;
        }
         for(int i=0; i<x; i++){
             if(i*i == x){             //i==x/i;
                 return i;
             }
             if(i*i<x && (i+1)*(i+1)>x){
                 return i;
             }
         }
         return 0;
        
    }
	//binary search 
	public static int mySqrt1(int x) {
		if(x==0||x==1){
            return x;
        }
		int left = 0;
        int right = x;
        int mid = left+(right-left)/2;
        while((mid*mid>x) || (mid+1)*(mid+1)<=x){   //mid>x/mid
        	System.out.println(" "+mid*mid);
            if(mid*mid>x){
                right = mid;
            }else if((mid+1)*(mid+1)<=x){
                left = mid;
            }
            mid = left+(right-left)/2;
        }
        return mid;
	}
	public static int mySqrt2(int x) {
		if(x==0||x==1) {
			return x;
		}
		long i = x;
		while(i>x/i) {
			i = (i+x/i)/2;
		}
		return (int) i;
	}
	public static void main(String[]args) {
		System.out.println(mySqrt1(2147395599));
	}
}
