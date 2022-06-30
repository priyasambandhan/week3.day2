package Week3.day2.assignment;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class FindMostDuplicate {
	public static void main(String[] args) {

		String data = "abbaba";
		HashMap<Character, Integer> map = new HashMap();
		char[] charArray = data.toCharArray();
		for (int i = 0; i < charArray.length; i++) {

			if (map.containsKey(charArray[i])) {
				map.put(charArray[i], map.get(charArray[i]) + 1);

			} else
				map.put(charArray[i], 1);
		}

		int maxOccurance = 0;
		Set<Entry<Character, Integer>> entryset = map.entrySet();
		for (Entry<Character, Integer> eachEntry : entryset)
			if (eachEntry.getValue() > maxOccurance) {
				maxOccurance = eachEntry.getValue();
			}
		System.out.println("The character with maximum occurance is ");

		for (Entry<Character, Integer> eachEntry : entryset)
			if (eachEntry.getValue() == maxOccurance) {
				System.out.print(" " + eachEntry.getKey());
			}
	}


}
