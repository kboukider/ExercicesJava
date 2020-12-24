package programminghubgoogle.array;

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class ObjectArray {

	
	String name;
	int emp_id;
	int salary;
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public void get_data() {
		try {
			System.out.println("\nEntrer name : ");
			name = br.readLine();
			System.out.println("\nEntrer emp id : ");
			emp_id = Integer.parseInt(br.readLine());
			System.out.println("\nEntrer salary : ");
			salary = Integer.parseInt(br.readLine());
		} catch (Exception e) {
			System.out.println("\n" + e);
		}
	}
	
	public void display() {
		System.out.print("\nName : "+name);
		System.out.print("\nEmp id : "+emp_id);
		System.out.print("\nSalary : " + salary);
	}
	
	
	
	public static void main(String[] args) {
		int i;
		ObjectArray emp[] = new ObjectArray[5];  //normalement la calss s appelle Epmloyee
		for (i = 0; i < 5; i++) {
			emp[i] = new ObjectArray();		
		}
		
		for (i = 0; i < 5; i++) {
			System.out.println("\nEntrer Employee Detail for employee "+ (i+1));
			emp[i].get_data();
		}
		
		for (i = 0; i < 5; i++) {
			System.out.println("\nEmployee Details for employee " + (i+1));
			emp[i].display();
		}
	}

}
