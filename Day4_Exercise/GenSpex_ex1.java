//Employee { empId, empName}
//SalariedEmployee : Employee {monthlyTakeAway}
//WagesEmployee : Employee {DailyTakeAway}
//
//AccountDept(Employee e){Every month-> calculate the payment and pay}->DailyWages*30, MonthlySal*1

package Exercise;

class Emp{ // generalization :: parent concept
	int eid;
	String name;
	public Emp() {}
	public Emp(int eid,String name) {
		this.eid = eid;
		this.name = name;
	}
	
	public String toString() {
		return "Emp [eid=" + eid + ", name=" + name + "]";
	}
	void print() {
		System.out.println(this.toString());
	}
	
}
class SalEmp extends Emp{
	int sal;
	public SalEmp(int id,String name,int sal) {
		super(id,name);
		this.sal  = sal;
	}
	public int getSalary() {
		// TODO Auto-generated method stub
		return sal;
	}
	@Override
	public String toString() {
		return "SalEmp [sal=" + sal + ", toString()=" + super.toString() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	}
	
}

class DailyEmp extends Emp{
	int salary;
	public DailyEmp(int id,String name,int salary) {
		super(id,name);
		this.salary = salary * 30 ;
	}
	public int getSalary() {
		
		return salary;
	}
	@Override
	public String toString() {
		return "DailyEmp [salary=" + salary + ", toString()=" + super.toString() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	}
	
	
}
class Accounts {
	public void salaryDetail(Emp e) {
		System.out.println("Employee id : "+e.eid+", name = "+e.name);
		if(e instanceof SalEmp) {
			SalEmp salary = (SalEmp)e;
			System.out.println("Salary : "+salary.getSalary());
		}
		if(e instanceof DailyEmp) {
			DailyEmp salary = (DailyEmp)e;
			System.out.println("Salary : "+salary.getSalary());
		}
	}
}
public class GenSpex_ex1{
	public static void main(String[] args) {
		Emp e1 = new SalEmp(101,"Tushar",30000);
		Emp e2 = new DailyEmp(102,"PC",34000);
		Accounts ac = new Accounts();
		ac.salaryDetail(e1);
		ac.salaryDetail(e2);
		
		

	}
}
