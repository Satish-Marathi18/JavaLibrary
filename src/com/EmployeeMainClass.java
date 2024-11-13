package com;

public class EmployeeMainClass {

	public static void main(String[] args) {
		Employee e1 = new Employee(101,"Satish");
		Employee e2 = new Employee(102,"Vikas");
		System.out.println(e1); //e1.toString()
		System.out.println(e2); //e2.toString()
	}
	
	
}


//Output:
//	Emp Id of Satish is 101
//	Emp Id of Vikas is 102