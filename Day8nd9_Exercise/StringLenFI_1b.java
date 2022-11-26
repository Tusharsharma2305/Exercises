package Exercises;
import java.util.function.*;
import java.util.*;
public class StringLenFI_1b {

	public static void main(String[] args) {
		
		Function<String, Integer> f = s -> s.length();
		System.out.print("Enter String : ");
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
        // computing length of String using Function FI
        System.out.println("Length of String is : " + f.apply(str));
        sc.close();
	}

}
