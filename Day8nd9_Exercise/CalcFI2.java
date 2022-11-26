package Exercises;
import java.util.function.BiFunction;
public class CalcFI2 {

	public static void main(String[] args) {
		 	BiFunction<Integer, Integer, Integer> add = (a, b) -> a + b;
		 
	        
	        System.out.println("Sum = " + add.apply(2, 3));
	 
	        
	        BiFunction<Integer, Integer, Integer> multiply = (a, b) -> a * b;
	 
	        
	        System.out.println("Product = " + multiply.apply(2, 3));
	        
	        BiFunction<Integer, Integer, Integer> Divide = (a, b) -> a / b;
	        System.out.println("Divide = " + Divide.apply(2, 3));
	        
	        BiFunction<Integer, Integer, Integer> Subtract = (a, b) -> a - b;
	        System.out.println("Subtraction  = " + Subtract.apply(2, 3));

	}

}
