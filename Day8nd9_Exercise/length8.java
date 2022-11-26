package Exercises;
import java.util.*;
public class length8 {

	public static void main(String[] args) {
		List<String> num = Arrays.asList("a","ab","abc","abcd");
		System.out.print("the length of a list of strings : " + num + "  individually :: \n ");
		num.stream().map(ele->ele.length()).forEach(ele -> System.out.print(ele+" "));
	}

}
