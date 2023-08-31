import java.util.ArrayList;
public class Solution {

	public static int findDuplicate(ArrayList<Integer> arr) {
		
		ArrayList<Integer> list = new ArrayList<>();
		for(int num : arr){
			if(list.contains(num)){
				return num;
			}
			list.add(num);
		}
		return -1;
	}
}
