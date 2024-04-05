package home.firstweek;

public class FindMissingElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {1,2,3,4,6,7,8};
		int n=array.length+1;
		int sum =n*(n+1)/2;
		int actualSum=0;
		for (int i = 0; i < array.length; i++) {
			actualSum += array[i];
		}
int missingElement =sum-actualSum;
System.out.println("Missing element in the array is:" + missingElement);
	}

}
