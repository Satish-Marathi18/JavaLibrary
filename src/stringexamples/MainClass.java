package stringexamples;

public class MainClass {

	public static void main(String[] args) {
		String student1= new String("java");
		System.out.println(student1);
		student1.concat(" program");
		System.out.println(student1);
		System.out.println("-------------");
		
		String student2= new String("java");
		System.out.println(student2);
		student2=student2.concat(" program");
		System.out.println(student2);
		System.out.println("-------------");
		
		StringBuffer student3= new StringBuffer("Wake");
		System.out.println(student3);
		student3.append(" Up");
		System.out.println(student3);
		System.out.println("--------------");
		
		StringBuilder student4 = new StringBuilder("Today is");
		System.out.println(student4);
		student4.append(" Thursday");
		System.out.println(student4);
	}
}
