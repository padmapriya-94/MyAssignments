package home.thirdweek;

import java.util.ArrayList;

import java.util.Collections;
import java.util.List;

public class MissingElement {

	public static void main(String[] args) {
	List<Integer> list=new ArrayList<Integer>();
	list.add(1);
	list.add(2);
	list.add(3);
	list.add(4);
	list.add(10);
	list.add(6);
	list.add(8);
	
		Collections.sort(list);
		System.out.println(list);
		
		int n=10;
		List<Integer> missingElements=new ArrayList<Integer>();
		List<Integer> fullList=new ArrayList<Integer>();
		
		for (int i = 1; i <=n; i++) {
			fullList.add(i);
		}
		
for(int i = 0; i <fullList.size(); i++) {
	int num=fullList.get(i);
	if (!list.contains(num)) {
		missingElements.add(num);
	}
}
System.out.println(missingElements);
}
}