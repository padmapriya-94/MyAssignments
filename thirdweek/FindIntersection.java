package home.thirdweek;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindIntersection {
	
public static void main(String[] args) {
	Integer[] array1= {3,2,11,4,6,7};
	Integer[] array2= {1,2,8,4,9,7};
	List<Integer> myList=new ArrayList<Integer>();
	myList.addAll(Arrays.asList(array1));
	List<Integer> myList1=new ArrayList<Integer>();
	myList1.addAll(Arrays.asList(array2));
	Collections.sort(myList);
	Collections.sort(myList1);
	Arrays.sort(array2);
	System.out.println("The sorted List are:");
	System.out.println(myList );
	System.out.println(myList1);
	System.out.println("The same elements are:");
	for (int i = 0; i <=myList.size()-1; i++) {
		Integer arr1=myList.get(i);
		for (int j = 0; j <=myList.size()-1; j++) {
			Integer arr2=myList1.get(j);
			if(arr1.equals(arr2))
			{
				System.out.println(arr1);
			}
			
		}
	}
}
}


