package Exercises;

import java.util.*;
import java.util.stream.Collectors;

public class LowerCase9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> s = Arrays.asList("HELLO","WorLd");
		List<String> res = s.stream()
                .map(String::toLowerCase)
                .collect(Collectors.toList());
		System.out.println("To Lower Case :: "+ res);


	}

}
