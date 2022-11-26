package Exercises;
import java.util.Arrays;
import java.util.List;
public class EmptyStr {

		public static void main(String[] args) {
			
			List<String> arrStr = Arrays.asList("abc", "", "bc", "", "abcd","", "jkl");
	        //Count empty strings
			System.out.println(arrStr);
	        long count = arrStr.stream().filter(x -> x.isEmpty()).count();
	        System.out.println("Empty Strings Count: " + count);

		}
}
