package Exercises;
import java.util.*;
public class CountEmptyStr10 {

	public static void main(String[] args) {
		List<String> s = Arrays.asList("","a","","abc","","hello");
		
		System.out.print("Count of Empty Strings : " + s.stream().filter(ele->ele.isEmpty()).count());

	}

}
