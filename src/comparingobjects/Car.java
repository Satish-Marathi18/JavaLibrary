package comparingobjects;

public class Car {

	int cost;
	
	Car(int cost){
		this.cost=cost;
	}
	
	@Override
	public boolean equals(Object obj) {//Upcasting -> Object obj = new Car(200);
		if(obj instanceof Car) {
			Car car = (Car) obj;			//Downcasting
			return this.cost==car.cost;	//comparision logic -> c1.cost==c2.cost;
		}
		return false;
	}
	
	public static void main(String[] args) {
		Car car1=new Car(200);
		Car car2=new Car(200);
		System.out.println(car1.equals(car2)); 	//c1.equals(new Car(200));
	}
}
