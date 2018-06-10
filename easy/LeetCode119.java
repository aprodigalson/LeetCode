import java.util.ArrayList;
import java.util.List;

public class LeetCode119 {
	public List<Integer> getRow(int rowIndex) {
        List<Integer> res = new ArrayList<>();
        if(rowIndex<0)return res;
        List<Integer> pre = new ArrayList<>();
        for(int i=0; i<rowIndex+1; i++) { 	
        	res.add(0,1);
        	for(int j=1; j<pre.size()-1; j++) {
        		res.set(j, pre.get(j)+pre.get(j+1));
        	}
        	pre = res;
        }
        return res;
    }
	public List<Integer> getRow1(int rowIndex){
		List<Integer> res = new ArrayList<>();
		for(int i=0; i<rowIndex+1 ; i++) {
			res.add(1);
			for(int j=i-1;j>0;j--) {
				res.set(j, res.get(j-1)+res.get(j));
			}
		}
		return res;
	}
	//mathematics method 
	//r[i] = r[i-]*(index-i+1)/i
	public List<Integer> getRow2(int rowIndex){
		List<Integer> res = new ArrayList<>();
		if(rowIndex<0)return res;
		res.add(1);
		if(rowIndex==0)return res;
		int pre=1;
		for(int k=0; k<rowIndex; k++) {
			pre = pre*(rowIndex-k)/(k+1);
			res.add(pre);
		}
		return res;
	}
}
