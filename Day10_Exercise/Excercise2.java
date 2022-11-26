package Exercise;

import java.util.*;

class Employee {

	public int Age;
	public String name;

	public Employee(int Age, String name) {
		this.Age = Age;
		this.name = name;

	}

	@Override
	public String toString() {
		
		return "Employee [Name = " + name + ", Age = " + Age + "]\n";
		
	}
}
//
class InvalidInputException extends RuntimeException {
	public InvalidInputException(String explaination) {
		super(explaination);
	}
}

class ExceptionCheck {
	static boolean age(int m) {
		if (m < 0) {
			throw new InvalidInputException("Ghosts are Not allowed as Employee");
		} else if (m > 0 && m < 18) {
			throw new InvalidInputException("Childrens are Not allowed as Employee");
		} else if (m >= 60 && m < 100) {
			throw new InvalidInputException("Seniors are Not allowed as Employee");
		} else if (m >= 100) {
			throw new InvalidInputException("purvaj are Not allowed as Employee");
		}
		return true;

	}

	static boolean DuplicateName(String name, List<String> a) {

		if (a.contains(name)) {
			throw new InvalidInputException("Name already Exits in List!!");
		}
		return true;
	}

}

public class Excercise2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice, age;
		List<Employee> ls = new ArrayList<Employee>();
		List<String> names = new ArrayList<String>();
		String naam;
		

		do {
			System.out.println("Please Select the Operation\n1.Enter New Employee\n2.Display Employeee\n3.Exit");
			choice = sc.nextInt();

			if (choice == 1) {
				System.out.println("Enter the Name");
				naam = sc.next();
				System.out.println("Enter the Age");
				age = sc.nextInt();

				try {
					if (ExceptionCheck.DuplicateName(naam, names) && ExceptionCheck.age(age)) {
						ls.add(new Employee(age, naam));
						names.add(naam);

					}

				} catch (Exception e) {
					System.out.println(e);
				}
				
			} else if (choice == 2) {
				System.out.println(ls.toString());
			}
		} while (choice != 3);
		sc.close();

	}

}