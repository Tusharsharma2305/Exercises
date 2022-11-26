package Exercise;

public class Patient {
	int id,age;
	String name,address;
	String distype,payment,doctor;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getDistype() {
		return distype;
	}
	public void setDistype(String distype) {
		this.distype = distype;
	}
	public String getPayment() {
		return payment;
	}
	public void setPayment(String payment) {
		this.payment = payment;
	}
	public String getDoctor() {
		return doctor;
	}
	public void setDoctor(String doctor) {
		this.doctor = doctor;
	}
	public Patient() {}
	public Patient(int id,String name,int age,String address,String distype,String payment,String doctor) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.address = address;
		this.distype = distype;
		this.payment = payment;
		this.doctor = doctor;
	}
	@Override
	public String toString() {
		return "Patient [id=" + id + ", age=" + age + ", name=" + name + ", address=" + address + ", distype=" + distype
				+ ", payment=" + payment + ", doctor=" + doctor + "]";
	}
	

}
