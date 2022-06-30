package Week3.day2.assignment;
import java.util.TreeMap;



public class FindNumberOfOccurances {
	public static void main(String[] args) {
		
		int[] data= {2,3,5,6,3,2,1,4,2,1,6,-1,6,6};
		TreeMap<Integer, Integer> map= new TreeMap();
		//int val=0;
		for (int i = 0; i < data.length; i++) {
				
		if (map.containsKey(data[i]))
		{
			
			map.put(data[i],map.get(data[i])+1);
			
		}
		else
			map.put(data[i], 1);
		
		}
		System.out.println("The number of occurences of each member in the array is "+map);
	}

}
