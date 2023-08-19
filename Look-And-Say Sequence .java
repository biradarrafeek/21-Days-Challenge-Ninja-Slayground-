import java.util.*;
public class Solution {
	public static String lookAndSaySequence(int n) {
		if(n<=0){
			return "";
		}
		//Starting with the first term
		String sequence = "1";
		for(int i=1;i<n;i++){
			//Generating the next termin the sequence
			sequence = getNextTerm(sequence);
		}
		return sequence;
	}
	private static String getNextTerm(String sequence){
		StringBuilder nextTerm = new StringBuilder();
		int count = 1;
		char currentDigit = sequence.charAt(0);

		for(int i=1;i<sequence.length();i++){
			if(sequence.charAt(i) == currentDigit){
				count++;
			}
			else{
			//Appending count and digitto the nexr term
				nextTerm.append(count).append(currentDigit);
				count = 1;
				currentDigit = sequence.charAt(i);
			}
		}
		nextTerm.append(count).append(currentDigit);
		return nextTerm.toString();
	}
}
