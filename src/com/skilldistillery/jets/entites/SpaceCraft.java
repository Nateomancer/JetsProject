package com.skilldistillery.jets.entites;

public class SpaceCraft extends Ship {

	private double speed;
	private int range;
	private long price;
	private String model;

	public SpaceCraft(String model, double speed, int range, long price) {
		super(model, speed, range, price);

//		this.speed = speed;
//		this.range = range;
//		this.price = price;
//		this.model = model;
	}

	public SpaceCraft() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub

	}

}
