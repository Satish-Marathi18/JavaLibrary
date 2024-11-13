package storingobjects;

public class StudentMainClass {

	public static void main(String[] args) {
		Student student1=new Student("Satish");
		Student student2=new Student("Vikas");
		
		Student[] s= {student1,student2};
		for(int i=0;i<s.length;i++) {
			
			System.out.println(s[i]);
		}
	}
}
