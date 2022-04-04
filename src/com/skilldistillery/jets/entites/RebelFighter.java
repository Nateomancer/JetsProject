package com.skilldistillery.jets.entites;

public class RebelFighter extends Ship implements DestroyDeathStar {

	private double speed;
	private int range;
	private long price;
	private String model;

	public RebelFighter(String model, double speed, int range, long price) {
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
	public void deathStar() {
		// TODO Auto-generated method stub
		System.out.println("Briefed and ready for take off");
		
	}

}
	