// WAP in Java using Maps to enter 10 employee (the keys are the empid, the whole employee object is the value)Map with 10 entries of EmployeesMenu:1. Add a new Employee to the map (take input)2. Display the original list of employees (FCFS)3. Search for a particular employee according to the empid (Take empid as input)4. Sort Employee According to Sal (this should not change the original map)5. Sort Employee According to name (this should not change the original map)6. exitClass Employee{ int empid; String name; int sal;}

package ExercxisePkg_6;

import java.util.*;

class Employee {
	int empid;
	String name;
	int sal;

	Employee(int empid, String name, int sal) {
		this.empid = empid;
		this.name = name;
		this.sal = sal;
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", name=" + name + ", sal=" + sal + "]";
	}

}

public class Exercise_2 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		Map<Integer, Employee> map = new LinkedHashMap<>(10);
		int ch = 0;
		do {
			System.out.println("1. Add a new Employee to the map");
			System.out.println("2. Display the original list of employees");
			System.out.println("3. Search for a particular employee according to the empid");
			System.out.println("4. Sort Employee According to Sal");
			System.out.println("5. Sort Employee According to name");
			System.out.println("6. exit \n Please enter your choice");
			ch = sc.nextInt();
			switch (ch) {
			case 1: {
				System.out.print("Enter employee id : ");
				int eid = sc.nextInt();
				System.out.print("Enter employee name : ");
				String name = sc.next();
				System.out.print("Enter employee salary : ");
				int sal = sc.nextInt();
				Employee e = new Employee(eid, name, sal);
				map.put(eid, e);
				System.out.println("total employee are " + map.size());
				break;
			}
			case 2: {
				
				for (Map.Entry<Integer, Employee> e : map.entrySet()) {
					 System.out.println(e.getValue().toString());
				}
				break;
			}
			case 3: {
				System.out.print("Enter the employee id to be search : ");
				int s = sc.nextInt();
				if(map.get(s)!= null) {
					System.out.println(map.get(s).toString());
				}
				else {
					System.out.println("This id is not exist!!");
				}
				break;
			}
			case 4: {
				List<Employee> ls = new ArrayList<>();
				for (Map.Entry<Integer, Employee> e : map.entrySet()) {
					ls.add(e.getValue());
				}
				Collections.sort(ls, (a, b) -> a.sal - b.sal);
				for (Employee e : ls) {
					System.out.println(e.toString());
				}
				break;
			}
			case 5: {
				List<Employee> ls = new ArrayList<>();
				for (Map.Entry<Integer, Employee> e : map.entrySet()) {
					ls.add(e.getValue());
				}
				Collections.sort(ls, (a, b) -> a.name.compareTo(b.name));
				for (Employee e : ls) {
					System.out.println(e.toString());
				}
				break;
			}
			case 6 : System.exit(1);
			default : System.out.println("Please Enter a valid input !!");
			}

		} while (ch>=1 || ch<=6);

	}

}
