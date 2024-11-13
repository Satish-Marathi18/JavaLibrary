package stringexamples;

public class MainClass {

	public static void main(String[] args) {
		String s1= new String("java");
		System.out.println(s1);
		s1.concat(" program");
		System.out.println(s1);
		System.out.println("-------------");
		
		String s2= new String("java");
		System.out.println(s2);
		s2=s2.concat(" program");
		System.out.println(s2);
		System.out.println("-------------");
		
		StringBuffer s3= new StringBuffer("Wake");
		System.out.println(s3);
		s3.append(" Up");
		System.out.println(s3);
		System.out.println("--------------");
		
		StringBuilder s4 = new StringBuilder("Today is");
		System.out.println(s4);
		s4.append(" Thursday");
		System.out.println(s4);
	}
}
