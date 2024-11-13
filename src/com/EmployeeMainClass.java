package com;

public class EmployeeMainClass {

	public static void main(String[] args) {
		Employee employee1 = new Employee(101,"Satish");
		Employee employee2 = new Employee(102,"Vikas");
		System.out.println(employee1); //e1.toString()
		System.out.println(employee2); //e2.toString()
	}
	
	
}


//Output:
//	Emp Id of Satish is 101
//	Emp Id of Vikas is 102