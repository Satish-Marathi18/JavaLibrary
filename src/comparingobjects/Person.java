package comparingobjects;

public class Person {

	int age;
	double height;
	
	Person(int age,double height){
		this.age=age;
		this.height=height;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Person) {
			Person p = (Person) obj;
			return this.age==p.age && this.height==p.height;
		}
		return false;
	}
	
	public static void main(String[] args) {
		Person p1=new Person(22,5.8);
		Person p2=new Person(22,5.8);
		Car c1=new Car(100) ;
		System.out.println(p1.equals(p2));
	}
}
