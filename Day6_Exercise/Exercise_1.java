//  create a list of Emp(vector / arraylist) and print emps every time new emp is added
package ExercxisePkg_6;

import java.util.ArrayList;

class Empl{
	int id;
	String name;
	public Empl(int id, String name, ArrayList<Empl> emps) 
	{
		this.id = id;
		this.name = name;
		System.out.println("The previous list: "+ emps);
		System.out.println("The current emp added: "+ this.toString());
	}
	 
	

	public String toString() {
		return "Emp [id=" + id + ", name=" + name + "]";
	}

}

public class Exercise_1 {
	public static void main(String[] args) 
	{
		ArrayList<Empl> arr = new ArrayList<>();
		arr.add(new Empl(101,"E1",arr));
		arr.add(new Empl(102,"E2",arr));
		arr.add(new Empl(103,"E3",arr));
	}
}
