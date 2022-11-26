package Exercise;
import java.util.*;
public class Exercise_1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number: ");
		int x=sc.nextInt();
		
		try {
			int res = 10/x;
			}
		catch(ArithmeticException e) {
			System.out.println(e);  
			System.out.println("0 is entered");
		}

	}

}
