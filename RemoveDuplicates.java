package week3.day2;

import java.awt.List;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {

	 public static void removeDuplicates(String str)   
	    {     
	         LinkedHashSet<Character> set = new LinkedHashSet<>();   
	        //Add each character of the string into LinkedHashSet   
	        for(int i=0;i<str.length();i++)   
	            set.add(str.charAt(i));   
	            
	        // print the string after removing duplicate characters   
	        for(Character ch : set)   
	            System.out.print(ch);   
	    }   
	        	 
	    public static void main(String args[])   
	    {   
	        
	        String str = "We learn java basics as part of java sessions in java week1";   
	        //removeDuplicates() method by passing the string as an argument   
	        removeDuplicates(str);
	        
	    }   
	    }


