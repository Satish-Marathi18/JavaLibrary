package storingobjects;

public class HotelMainClass {

	public static void main(String[] args) {
		Hotel h1 = new Hotel("Taj",5);
		Hotel h2 = new Hotel("Samrat",4);
		Hotel h3 = new Hotel("MCafe",3);
		
		Hotel[] h = {h1,h2,h3};
		
		for(int i=0;i<h.length;i++) {
			System.out.println(h[i]);
		}
	}
}
