package week3.day2;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

public class SortingUsingCollections {

	public static void main(String[] args) {
		
		List<String> input =new ArrayList<String>();
		input.add("HCL");
		input.add("Wipro");
		input.add("Aspire Systems");
		input.add("CTS");
		System.out.println(input);
		System.out.println(input.size());
		Collections.sort(input);
		System.out.println("Ascending Order" + input);
		Collections.reverse(input);
		System.out.println("Descending Order" + input);
				
		//Set <String> sort=new TreeSet<String>(input);
		
//		Declare a String array and add the Strings values as (HCL, Wipro,  Aspire Systems, CTS)		

//		get the length of the array		

//		sort the array			

//		Iterate it in the reverse order

//		print the array
		
//		Required Output: Wipro, HCL , CTS, Aspire Systems

	}

}
