package storingobjects;

public class Hotel {

	String name;
	int ratings;
	
	Hotel(String name,int ratings){
		this.name=name;
		this.ratings=ratings;
	}
	
	@Override
	public String toString() {
		return "Ratings of "+name+" hotel is "+ratings;
	}
}
