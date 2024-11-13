package comparingobjects;

public class Student {

	int age;
	
	public Student(int age) {
		this.age=age;
	}
	
	@Override
	public boolean equals(Object obj) {//1.Upcasting -> Object obj=new Student();
		if(obj instanceof Student) {	//2.Checking if obj is having Student obj
			Student s = (Student) obj;	//3.If yes , we are downcasting
			return this.age==s.age;		//Comparison logic ->s1.age==s2.age;
		}
		return false;					//5.returning false for negative scenario
	}
	
	public static void main(String[] args) {
		Student s1 = new Student(22);
		Student s2 = new Student(22);
		System.out.println(s1.equals(s2)); //s1.equals(new Student(22));
	}
	
	//s1 -> this
	//s2 -> obj(upcasted reference) -> s(downcasted reference)
	//In the above program , upcasting is achieved only when we call equals().
	
}
