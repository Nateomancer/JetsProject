package com.skilldistillery.jets.entites;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.List;
import java.util.ArrayList;

//Jets
public abstract class Ship {

	// field variables
	private double speed;
	private int range;
	private long price;
	private String model;

//---methods---

	// prints you the jet details until it runs out of fuel
	// based on speed and range
	public abstract void fly();

	{

	}

//---constructors---
	// default constructor
	public Ship() {

	}

	// Primary Constructor
	public Ship(String model, double speed, int range, long price) {
		super();
		this.model = model;
		this.speed = speed;
		this.range = range;
		this.price = price;
	}

//---Getters and Setters
	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public int getRange() {
		return range;
	}

	public void setRange(int range) {
		this.range = range;
	}

	public long getPrice() {
		return price;
	}

	public void setPrice(long price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Model: "+  model+" Ship Speed: "+ speed + " Range: " + range + " Price: " + price;
	}


}

