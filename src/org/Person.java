package org;

public class Person {

	int age;
	
	Person(int age){
		this.age=age;
	}
	
	@Override
	public String toString() {
		return "Age:"+age;
	}
	
	public static void main(String[] args) {
		Person person1=new Person(21);
		Person person2=new Person(22);
		System.out.println(person1);
		System.out.println(person2);
	}
}
