package Week3.day2.assignment;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.List;

public class PrintDuplicatesinSet {
public static void main(String[] args) {
	
	Set<Integer> set1= new HashSet();
	List<Integer> myList=new ArrayList();
	myList.add(14);
	myList.add(12);
	myList.add(13);
	myList.add(11);
	myList.add(15);
	myList.add(14);
	myList.add(18);
	myList.add(16);
	myList.add(17);
	myList.add(19);
	myList.add(18);
	myList.add(17);
	myList.add(20);
			
for(int i=0;i<myList.size();i++)
	{
		
	if(set1.add(myList.get(i))==false)
	{
		System.out.println("The duplicate value in the set is"+myList.get(i));
	}
	
	}
}
}

