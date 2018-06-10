
public class LeetCode122 {
	public int maxProfit(int[] prices) {
        return calculate(prices,0);
    }
	//brute force o(n^n)???
	public int calculate(int prices[], int s) {
		if(s>=prices.length)return 0;
		int max = 0;
		for(int start=s; start<prices.length; start++) {
			int maxprofit = 0;
			for(int i=start+1; i<prices.length; i++) {
				if(prices[start]<prices[i]) {
					int profit = calculate(prices,i+1)+prices[i]-prices[start];
					if(profit>maxprofit){
						maxprofit= profit;
					}
				}
			}
			if(maxprofit>max) {
				max = maxprofit;
			}
		}
		return max;
	}
	//plot the numbers of the given array on a graph
	//analyze the graph,
	//o(n)
	public int maxProfit1(int[] prices) {
		int i = 0;
		int valley = prices[0];//low point
		int peak = prices[0];//high point
		int maxprofit = 0;
		while(i<prices.length-1) {
			while(i<prices.length-1 && prices[i]>=prices[i+1])i++;
			valley = prices[i];
			while(i<prices.length-1 && prices[i]<=prices[i+1])i++;
			peak = prices[i];
			maxprofit +=peak-valley;
		}
		return maxprofit;
	}
	//the same as the maxProfit1(),but only be care about profit 
	public int maxProfit2(int[] prices) {
		int maxprofit = 0;
		for(int i=1; i<prices.length; i++) {
			if(prices[i]>prices[i-1]) {
				maxprofit+=prices[i]-prices[i-1];
			}
		}
		return maxprofit;
	}
}
