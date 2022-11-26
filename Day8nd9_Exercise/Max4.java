package Exercises;
import java.util.*;
public class Max4 {

	public static void main(String[] args) {
		List<Integer> number = Arrays.asList(2,3,4,5);
		Optional<Integer> s = number.stream().reduce((x,y)->x>y?x:y);
	    if(s.isPresent()) {
	    	 System.out.println("Highest value in ArrayList : "+s.get());
	    }
	   
	}

}
