package week3.day2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class FindIntersects {

static void printIntersection(int arr1[], int arr2[])
    {
        HashSet<Integer> hs = new HashSet<>();
       
        for (int i = 0; i < arr1.length; i++)
            hs.add(arr1[i]);
 
        for (int i = 0; i < arr2.length; i++)
            if (hs.contains(arr2[i]))
                System.out.print(arr2[i] + " ");
    }
 
    public static void main(String[] args)
    {
        int arr1[] = { 3,2,11,4,6,7 };
        int arr2[] = { 1,2,8,4,9,7 };
 
      System.out.println("Intersection of two arrays is : ");
        printIntersection(arr1, arr2);
    }

}
