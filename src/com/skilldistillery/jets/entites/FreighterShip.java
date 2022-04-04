package com.skilldistillery.jets.entites;

public class FreighterShip extends Ship {

	private double speed;
	private int range;
	private long price;
	private String model;
	
	
	public FreighterShip(String model, double speed, int range, long price) {
		super( model,speed, range, price);
//		this.model = model;
//		this.speed = speed;
//		this.range = range;
//		this.price = price;

	}

	@Override
	public void fly() {

	}

}
