package stringexamples;

public class Solution {
	public static void main(String[] args) {
		String s = new String("AB");
		System.out.println(s);  //calls s.toString() implicitly
		System.out.println(s.toString());
		System.out.println("------------");
		
		System.out.println(s.hashCode());
		System.out.println("------------");
		
		String s1 = new String("java");
		String s2 = new String("java");
		System.out.println(s1==s2); //Compares the address or reference
		System.out.println(s1.equals(s2)); //COmpares the data or content
		System.out.println("------------");
	}
}
