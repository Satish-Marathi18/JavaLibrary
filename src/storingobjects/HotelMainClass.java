package storingobjects;

public class HotelMainClass {

	public static void main(String[] args) {
		Hotel hotel1 = new Hotel("Taj",5);
		Hotel hotel2 = new Hotel("Samrat",4);
		Hotel hotel3 = new Hotel("MCafe",3);
		
		Hotel[] hotels = {hotel1,hotel2,hotel3};
		
		for(int i=0;i<hotels.length;i++) {
			System.out.println(hotels[i]);
		}
	}
}
