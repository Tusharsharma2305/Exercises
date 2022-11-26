package Exercise;
import java.util.Scanner;

public class StrPalindrome{
	private static Scanner sc;
	public static void main(String[] args) {
		String normStr;

		sc= new Scanner(System.in);

		System.out.print("\nPlease Enter String to check Palindrome =  ");
		normStr = sc.nextLine();
		
		StringBuilder sb = new StringBuilder(normStr);
		
		String revStr = sb.reverse().toString();
		System.out.println("\nThe result of String Reverse =  " + revStr);
		
		if(normStr.equalsIgnoreCase(revStr) == true) {
			System.out.println("\nThe Given String " + normStr + " is a Palindrome");
		}
		else {
			System.out.println("\nThe Given String " + normStr + " is not");
		}	
//		String s="malayalam";
//		s=s.toLowerCase();
//		StringBuffer bf=new StringBuffer(s);
//		bf.reverse();
//		String s1= bf.toString();
//		s1=s1.toLowerCase();
//		if(s.equals(s1)) {
//			System.out.println("yes");
//		}
//		else
//				System.out.println("no");}
	}
}