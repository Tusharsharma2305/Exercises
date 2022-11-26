//WAP in Java – Generics to design a class called myCol which can store data in int, double or string format.

package ExerciseDay5;

import java.util.ArrayList;


class MyCol<U>{

	
	U sal;
	public MyCol( U sal) {
		this.sal = sal;
	}
	public MyCol() {
	}
	
	ArrayList<U> al = new ArrayList<>();
	
	public void addToArr(U e) {
		al.add(e);
	
	}
	public void Print() {
		for (int i=0; i<al.size(); i++) {
			  U curr = al.get(i);

			  System.out.print(curr.getClass().getName() + " -> " + curr  + " , ");
			  
			}
	}
	
	
}
public class Generic1 {
	public static void main(String[] args) {
		
		
		
		MyCol<Integer> e1 = new MyCol<Integer>();
		MyCol<Double> e2 = new MyCol<Double>();
		MyCol<String> e3 = new MyCol<String>();
		
		e1.addToArr(79990);e1.Print();
		e2.addToArr(90887.00);e2.Print();
		e3.addToArr("299887");e3.Print();
		
		
	}
}
