package Exercise;
import java.io.*;
public class Main {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Hello User Please Enter Your Name: \n");
		String user = br.readLine();
		System.out.println("Welcome To Patient Management System-----> " + user);
		while(true) {
			System.out.println("PRESS 1 to ADD Patient");
			System.out.println("PRESS 2 to DISPLAY Patient");
			System.out.println("PRESS 3 to DISPLAY ALL Patient");
			System.out.println("PRESS 4 to UPDATE Patient");
			System.out.println("PRESS 5 to DELETE Patient");
			System.out.println("PRESS 6 to EXIT");
			int c = Integer.parseInt(br.readLine());
			if(c==1) {
				System.out.println("Enter Your Name : ");
				String pName = br.readLine();
				System.out.println("Enter Your Id : ");
				int pId = Integer.parseInt(br.readLine());
				System.out.println("Enter Your Age : ");
				int pAge = Integer.parseInt(br.readLine());
				System.out.println("Enter Permanent Address : ");
				String pAddr = br.readLine();
				System.out.println("Enter Your Disease Type : ");
				String pdistype = br.readLine();
				System.out.println("Enter Payment status (done/not yet) : ");
				String pPay = br.readLine();
				System.out.println("Enter Your Doctor name : ");
				String pDoctor = br.readLine();
				
				Patient p = new Patient(pId,pName,pAge,pAddr,pdistype,pPay,pDoctor);
				boolean ans = PatientCRUD.insert(p);
				if(ans) {
					System.out.println("-------Patient record Inserted Successfully--------\n");
					System.out.println();
				}
				else {
					System.out.println("Some error Occured While Inserting...Please try Again!\n");
				}
				
			}
			else if(c==2) { //display
			
				
				PatientCRUD.display();
			}
			else if(c==3) { //displayALl
			
				
				PatientCRUD.displayAll();
			}
			else if(c==4) { //update
				System.out.println("PRESS 1 to UPDATE Name");
				System.out.println("PRESS 2 to UPDATE Address");
				System.out.println("PRESS 3 to UPDATE Payment Status");
				
				
				int val = Integer.parseInt(br.readLine());
				
				if(val == 1) {
					//Update Name
					System.out.print("Enter name to UPDATE : ");
					String pname = br.readLine();
					System.out.print("Enter ID to identify patient : ");
					int pid = Integer.parseInt(br.readLine());
					Patient p = new Patient();
					p.setName(pname);
					boolean f = PatientCRUD.update(val,pname,pid,p);
					if(f) {
						System.out.println("-------Patient record Updated Successfully--------\n");
					}else {
						System.out.println("Something Went Wrong Please try Again!");
					}
				}
				
				else if(val == 2) {
					//Update Address
					System.out.println("Enter Address to UPDATE...");
					String paddr = br.readLine();
					System.out.println("Enter ID to identify patient!");
					int pid = Integer.parseInt(br.readLine());
					Patient p = new Patient();
					p.setAddress(paddr);
					boolean f = PatientCRUD.update(val,paddr,pid,p);
					if(f) {
						System.out.println("-------Patient Address record Updated Successfully--------\n");
					}else {
						System.out.println("Something Went Wrong Please try Again!");
					}
				}
				else if(val == 3) {
					//Update Payment
					System.out.println("Enter Payment status to UPDATE...");
					String ppay = br.readLine();
					System.out.println("Enter ID to identify patient!");
					int pid = Integer.parseInt(br.readLine());
					Patient p = new Patient();
					p.setPayment(ppay);
					boolean f = PatientCRUD.update(val,ppay,pid,p);
					if(f) {
						System.out.println("-------Patient Payment status Updated Successfully--------\n");
					}else {
						System.out.println("Something Went Wrong Please try Again!");
					}
				}
				else {
					System.out.println("Hey You have not updated Anything... Please choose option Correctly!");
				}
				
			}
			else if(c==5) {//delete
				System.out.println("Enter Patient ID To Delete: ");
				int pid = Integer.parseInt(br.readLine());
				boolean f = PatientCRUD.delete(pid);
				if(f) {
					System.out.println("Patient Of ID " + pid + " --------Record Deleted-------\n ");
				}else {
					System.out.println("Something Went Wrong.. Please try Again!");
				}
			}
			else if(c==6) { //Exit
				System.out.println("Thank You For Using Application...If You Enjoyed, Please Experience It Again!" + user);
				break;
			}
			else {
				
			}
		}
	}

}
