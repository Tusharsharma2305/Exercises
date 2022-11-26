package Exercise;

public class Exercise1_7day {
	interface MathOp{
		int operation(int x, int y);
	}
	public static void main(String[] args) {
		MathOp Sumop = (x, y) -> x+y;
		System.out.println("Addition : x+y: " + Sumop.operation(10, 2));
		
		MathOp Subop = (x, y) -> x>y?x-y:y-x;
		System.out.println("Subtraction : x-y: " + Subop.operation(10, 2));
		
		MathOp Mulop = (x, y) -> x*y;
		System.out.println("Multiplication : x*y: " + Mulop.operation(10, 2));
		
		MathOp Divop = (x, y) -> y==0?0:x/y;
		System.out.println("Divison : x/y: " + Divop.operation(10, 2));
		
		MathOp Moop = (x, y) -> x%y;
		System.out.println("Modulus : x%y: " + Moop.operation(11, 2));
	}
}
