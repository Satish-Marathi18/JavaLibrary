package comparingobjects;

public class Student {

	int age;
	
	public Student(int age) {
		this.age=age;
	}
	
	@Override
	public boolean equals(Object obj) {//1.Upcasting -> Object obj=new Student();
		if(obj instanceof Student) {	//2.Checking if obj is having Student obj
			Student student = (Student) obj;	//3.If yes , we are downcasting
			return this.age==student.age;		//Comparison logic ->s1.age==s2.age;
		}
		return false;					//5.returning false for negative scenario
	}
	
	public static void main(String[] args) {
		Student student1 = new Student(22);
		Student student2 = new Student(22);
		System.out.println(student1.equals(student2)); //s1.equals(new Student(22));
	}
	
	//s1 -> this
	//s2 -> obj(upcasted reference) -> s(downcasted reference)
	//In the above program , upcasting is achieved only when we call equals().
	
}
