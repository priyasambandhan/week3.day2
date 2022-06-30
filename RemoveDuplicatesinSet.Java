package Week3.day2.assignment;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {
	public static void main(String[] args) {
		
		String text = "We learn java basics as part of java sessions in java week1";
		String[] mytext= text.split(" ");
		Set<String> set1= new LinkedHashSet();
	
		for (int i=0; i<mytext.length; i++)
		{
			set1.add(mytext[i]);
						
		}
		System.out.println("The duplicate removed sentence is");
		for (String eachvalue:set1)
		{
		System.out.print(eachvalue+" ");
		}
				
	}

	
}
