package Week3.day2.assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindSecondLargest {
	
	public static void main(String[] args) {
		List<Integer> list1=new ArrayList();
		list1.add(3);
		list1.add(2);
		list1.add(11);
		list1.add(4);
		list1.add(6);
		list1.add(7); 
		Collections.sort(list1);
		System.out.println(list1);
		System.out.println("The second largest value in the given set is "+ list1.get(list1.size()-2));
	}

}
