import java.util.*;
public class Solution {
	public static int removeDuplicates(ArrayList<Integer> arr,int n) {
		// Write your code here.
		TreeSet<Integer> set = new TreeSet<>();
		for(int i=0;i<n;i++){
			set.add(arr.get(i));
		}
		return set.size();	
	}
}
