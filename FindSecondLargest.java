package week3.day2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class FindSecondLargest {

	public static void findLargest(int[] data,int total)
	{
		List<Integer> list=new ArrayList<>();
		
		for (int i=1;i<data.length;i++)
			list.add(data[i]);
		//Collections.sort(list);
		System.out.println(list);
		int element=list.get(total-2);  
		System.out.println(element);
				
	}
	public static void main(String[] args)
	{
		int[] data = {3,2,11,4,6,7};
		findLargest(data,6);

	}

}
