
public class LeetCode121 {
	//brute force
	public int maxProfit(int[] prices) {
        int max=0;
        for(int i=0; i<prices.length; i++) {
        	for(int j=i+1; j<prices.length; j++) {
        		if(prices[j]>prices[i]) {
        			if(prices[j]-prices[i]>max) {
        				max = prices[j]-prices[i];
        			}
        		}
        	}
        }
        return max;
    }
	//o(n);
	//interesting thought;
	public int maxProfit1(int[] prices) {
        int max=0;
        int min=Integer.MAX_VALUE;
        for(int i=0; i<prices.length; i++) {
        	if(prices[i]<min)
        		min = prices[i];
        	else if(prices[i] - min >max) {
        		max = prices[i]-min;
        	}
        }
        return max;
    }
}
