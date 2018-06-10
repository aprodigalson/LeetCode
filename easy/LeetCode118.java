import java.util.ArrayList;
import java.util.List;

public class LeetCode118 {
	//detail is important
	public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();
        if(numRows==0)return list;
        list.add(new ArrayList<>());
        list.get(0).add(1);
        
        for(int i=1; i<numRows; i++) {//line i-1
        	List<Integer> l = new ArrayList<>();
        	List<Integer> pre = list.get(i-1);
        	l.add(1);
        	for(int j=1; j<i; j++) {
        		l.add(pre.get(j-1)+pre.get(j));
        	}
        	l.add(1);
        	list.add(l);
        }
        return list;
    }
}
