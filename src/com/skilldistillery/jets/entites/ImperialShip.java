package com.skilldistillery.jets.entites;

public class ImperialShip extends Ship {

	public ImperialShip(String model, double speed, int range, long price) {
		super();
//		this.model = model;
//		this.speed = speed;
//		this.range = range;
//		this.price = price;
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub

	}

	@Override
	public String toString() {
		return "ImperialShip model " + getModel() + " "  + getSpeed() +" " + getSpeed() + ", getRange()=" + getRange()
				+ ", getPrice()=" + getPrice() + ", toString()=" + super.toString() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	}
	
	
}

	

}
