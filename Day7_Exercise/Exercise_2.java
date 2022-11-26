package Exercise;


class A{
	
	int sum(int x, int y) {
		return x+y;
	}
	int sub(int x, int y) {
		return (x>y?x-y:0);
	}
	int mul(int x, int y) {
		return x*y;
	}
	int div(int x, int y) {
		return (y==0?0:x/y);
	}
	
}
interface F{
	int sam(int x, int y);
}
public class Exercise_2 {
	public static void main(String[] args) {
	F a1 = new A() :: sum;
	System.out.println("Sum(10,2): " + a1.sam(10, 2));
	F a2= new A() :: sub;
	System.out.println("Sub(10,2): " + a2.sam(10,2));
	F a3 = new A() :: mul;
	System.out.println("Mul(10,2): " + a3.sam(10,2));
	F a4 = new A() :: div;
	System.out.println("Division(10,2): " + a4.sam(10,2));

}
}
