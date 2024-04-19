package home.thirdweek;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SecondLargest {

	public static void main(String[] args) {
		Integer[] array= {3,2,11,4,6,7};
		List<Integer> myList=new ArrayList<Integer>();
		myList.addAll(Arrays.asList(array));
		Collections.sort(myList);
		// 2 3 4 6 7 11
		System.out.println("The Sorted list is:" + myList);
		int max=0;
		for (int i = 0; i < myList.size()-1; i++) {
			int fmax=myList.get(i);  
			int smax=myList.get(i+1);
			
			if (fmax>smax) {
			System.out.println(smax);
			}
			else if(smax>fmax)
			{
				max=fmax;
				
			}
			
			
		}
		System.out.println("The second Largest number is:" +max);
		
		}
		

}
