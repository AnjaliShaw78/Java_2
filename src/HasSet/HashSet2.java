package HasSet;
import java.util.*;
public class HashSet2 {

	public static void main(String[] args) {
		String str ="This is a test this is only a test";
		String[] words = str.split(" ");
		Map<String,Integer> hm = new HashMap<>();
		for(String word: words) {
			if(hm.containsKey(word)) {
				hm.put(word, (hm.get(word)+1));
				
			}
			else {
				hm.put(word, 1);
				//System.out.println(hm);
			}
		}
		for(String word: hm.keySet()) {
			System.out.println("Word"+" "+word+" "+"Count:"+hm.get(word));
		}

	}

}
