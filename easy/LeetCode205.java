import java.util.HashMap;
import java.util.Map;

public class LeetCode205 {
	 public boolean isIsomorphic(String s, String t) {
		 if(s.length()!=t.length())return false;
		 Map<Character,Character> map = new HashMap<>();
		 Map<Character,Character> map1= new HashMap<>();
		 for(int i=0; i<s.length(); i++) {
			 if(map.containsKey(s.charAt(i))) {
				 if(map.get(s.charAt(i))!=t.charAt(i)) {
					 return false;
				 }
			 }else {
				 map.put(s.charAt(i), t.charAt(i));
			 }
		 }
		 for(int i=0; i<s.length(); i++) {
			 if(map1.containsKey(t.charAt(i))) {
				 if(map1.get(t.charAt(i))!=s.charAt(i)) {
					 return false;
				 }
			 }else {
				 map1.put(t.charAt(i), s.charAt(i));
			 }
		 }
		 return true;
	 }
}
