package home.firstweek;

public class PalindromeNumber {
	public static void isPalindrome(int number) {
		// TODO Auto-generated method stub
String numString = Integer.toString( number);
int length =numString.length();
int i;
for(i=0;i<length/2;i++)
{
	if (numString.charAt(i)!=numString.charAt(length-i-1)) {
		System.out.println(number + "Is not a palindrome");
		break;
	}
}
if (i==length/2) {
System.out.println(number + "Is a palindrome");	
}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number =12321;
		isPalindrome(number);

	}

}
