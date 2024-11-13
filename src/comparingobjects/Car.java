package comparingobjects;

public class Car {

	int cost;
	
	Car(int cost){
		this.cost=cost;
	}
	
	@Override
	public boolean equals(Object obj) {//Upcasting -> Object obj = new Car(200);
		if(obj instanceof Car) {
			Car c= (Car) obj;			//Downcasting
			return this.cost==c.cost;	//comparision logic -> c1.cost==c2.cost;
		}
		return false;
	}
	
	public static void main(String[] args) {
		Car c1=new Car(200);
		Car c2=new Car(200);
		System.out.println(c1.equals(c2)); 	//c1.equals(new Car(200));
	}
}
