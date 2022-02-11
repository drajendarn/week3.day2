package week3.day2;

import java.util.HashSet;

public class MissingElementInAnArray {

	public static void missingElement(int[] arr)
	{
		HashSet<Integer> set=new HashSet<>();
		for (int i=0;i<arr.length;i++)
		 			
			set.add(arr[i]);
		System.out.print(set);
		for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i]+1!=arr[i+1])
            {
                System.out.println( "Missing Elementt is: " + (arr[i]+1));
                break;
            }
        }
		
	}
		
	public static void main(String[] args) 
	{
		int[] arr = {1,2,3,4,7,6,8};
		missingElement(arr);
	}
	

}
