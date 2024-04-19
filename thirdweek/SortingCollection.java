package home.thirdweek;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortingCollection {

	public static void main(String[] args) {
		String[] company= {"HCL","Wipro","Aspire Systems","CTS"};
		List<String> myList=new ArrayList<String>();
		myList.addAll(Arrays.asList(company));
		Collections.sort(myList);
		System.out.println("Sorted list:"+ myList);
		System.out.println("In Reverse orer:");
		for (int i =myList.size()-1; i >=0 ; i--) {
			System.out.println(myList.get(i));
		}
	}

}

