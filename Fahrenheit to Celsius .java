import java.util.* ;
import java.io.*; 

public class Solution {

	public static List<List<Integer>> fahrenheitToCelsius(int s, int e, int w) {
		List<List<Integer>> list = new ArrayList<>();

		while(s<=e){
			int c = ((s-32)*5)/9;
			List<Integer> temp = new ArrayList<>();
			temp.add(s);
			temp.add(c);
			list.add(temp);
			s=s+w;
		}

		// for(int i=s;i<=e;i=i+w){
		// 	List<Integer> temp = new ArrayList<>();
		// 	int c = (i-32)*5/9;
		// 	temp.add(i);
		// 	temp.add(c);
		// 	list.add(temp);
		// }
		return list;
	}

}
