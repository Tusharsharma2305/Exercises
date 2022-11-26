package Exercises;
import java.util.*;
public class UniqueSqr {
	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(3,2,2,3,7,3,5);

		numbers.stream().distinct().map(ele1->ele1).map(ele->ele*ele).forEach(ele -> System.out.print(ele+" "));
		

	}
}
