
public class LeetCode836 {
	public static boolean isRectangleOverlap(int[] rec1, int[] rec2) {
		//wrong....
		//too much judge..
		int[] rec11 = {rec1[0],rec1[1]};
		int[] rec12 = {rec1[2],rec1[3]};
		int[] rec13 = {rec1[0],rec1[3]};
		int[] rec14 = {rec1[2],rec1[1]};
		int[] rec21 = {rec2[0],rec2[1]};
		int[] rec22 = {rec2[2],rec2[3]};
		int[] rec23 = {rec2[0],rec2[3]};
		int[] rec24 = {rec2[2],rec2[1]};
		return isIn(rec11,rec2) || isIn(rec12,rec2) || isIn(rec13,rec2) || isIn(rec14,rec2) ||
				isIn(rec21,rec1)|| isIn(rec22,rec1) || isIn(rec23,rec1) || isIn(rec24,rec1);
	}
	private static boolean isIn(int[] point,int []rec) {
		if(point[0]<rec[2] && point[0]>rec[0] && point[1]<rec[3] && point[1]>rec[1]) {
			return true;
		}
		return false;
	}
	public static void main(String[]args) {
		int [] r1 = {7,8,13,15};
		int [] r2 = {10,8,12,20};
		System.out.println(isRectangleOverlap(r1,r2));
	}
	//in 1 dimension max(l1,l2)<min(r1,r2);
	//extend 1 dimension to 2 dimension
	public static boolean isRectangleOverlap1(int[] rec1,int []rec2) {
		return Math.max(rec1[0], rec2[0])<Math.min(rec1[2], rec2[2]) && 
				Math.max(rec1[1], rec2[1])<Math.min(rec1[3],rec2[3]);
	}
}
