package com.skilldistillery.jets.entites;

public class ImperialShip extends Ship implements HothAssault {

	private double speed;
	private int range;
	private long price;
	private String model;

	public ImperialShip(String model, double speed, int range, long price) {
		super(model, speed, range, price);

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
	public void hothAssault() {
		// TODO Auto-generated method stub
		System.out.println("Inferno Squad Ready to engage Hoth!");
		System.out.println("For the Empire");

	}

}
