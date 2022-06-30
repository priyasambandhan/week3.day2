package Week3.day2.assignment;

import java.util.ArrayList;
import java.util.List;

public class FindIntersection {
	public static void main(String[] args) {
		
		List<Integer> list1=new ArrayList();
		list1.add(3);
		list1.add(2);
		list1.add(11);
		list1.add(4);
		list1.add(6);
		list1.add(7);
		
		List<Integer> list2=new ArrayList();
		list2.add(1);
		list2.add(2);
		list2.add(8);
		list2.add(4);
		list2.add(9);
		list2.add(7);
		System.out.println("The intesection between the two arrays are :");
		System.out.println(list1);
		System.out.println(list2);
		
		for (int i=0;i<list1.size();i++)
		{
			int val1=list1.get(i);
			for(int j=0;j<list2.size();j++)
			{
				int val2= list2.get(j);
				if (val1==val2)
						System.out.println(val1);
			}
		}
		
	}

	
	
}
