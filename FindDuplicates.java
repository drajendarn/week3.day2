package week3.day2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindDuplicates {

	public static void findDuplicates(int[] arr)
	{
		List<Integer> list=new ArrayList<>();
		for (int i=0;i<arr.length;i++)
		 			
			list.add(arr[i]);
		System.out.println(list);
		
		Set<Integer> s = new HashSet<Integer>();

        for(Integer name : list) {
            if(s.add(name) == false)
                System.out.println(name + " is duplicated");
        }
	}
		
	public static void main(String[] args) 
	{
		int[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		findDuplicates(arr);
	}
	

}
