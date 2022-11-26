package Exercises;
//Q1 : Design a static calculator by using the above functional interfaces.
public class CalcFI {

	public static void main(String[] args) {
		interface MathOp{
			int operation(int x, int y);
		}
		
			MathOp Sumop = (x, y) -> x+y;
			System.out.println("Addition : x+y: " + Sumop.operation(10, 2));
			
			MathOp Subop = (x, y) -> x-y;
			System.out.println("Subtraction : x-y: " + Subop.operation(10, 2));
			
			MathOp Mulop = (x, y) -> x*y;
			System.out.println("Multiplication : x*y: " + Mulop.operation(10, 2));
			
			MathOp Divop = (x, y) -> x/y;
			System.out.println("Divison : x/y: " + Divop.operation(10, 2));
			
			MathOp Modop = (x, y) -> x%y;
			System.out.println("Modulus : x%y: " + Modop.operation(11, 2));
		}

}
