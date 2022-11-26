package Exercises;

import java.util.*;

public class Avg7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> number = Arrays.asList(2,3,4,5);
		System.out.print("Average of " + number +" is : ");
		System.out.print(number.stream()
		        .mapToDouble(d -> d)
		        .average()
		        .orElse(0.0));
	}

}
