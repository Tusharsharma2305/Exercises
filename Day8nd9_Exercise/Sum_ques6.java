package Exercises;

import java.util.stream.Collectors;
import java.util.*;
public class Sum_ques6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5);
		int sum = integers.stream().collect(Collectors.summingInt(Integer::intValue));
		System.out.print(sum);

	}

}
