package storingobjects;

public class StudentMainClass {

	public static void main(String[] args) {
		Student s1=new Student("Satish");
		Student s2=new Student("Vikas");
		
		Student[] s= {s1,s2};
		for(int i=0;i<s.length;i++) {
			
			System.out.println(s[i]);
		}
	}
}
