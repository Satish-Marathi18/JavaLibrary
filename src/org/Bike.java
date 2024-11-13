package org;

public class Bike {

	@Override
	public int hashCode() {
		return 100;
	}
	public static void main(String[] args) {
		Bike bike = new Bike();
		System.out.println(bike.hashCode());
	}
}
