package com.skilldistillery.jets.app;

//input/output to text
//import java.io.BufferedReader;
//import java.io.FileReader;
//Exceptions
//import java.io.IOException;
//iterator
//import java.util.Iterator;
//lists
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
//set
//import java.util.Set;
//import java.util.TreeSet;

import com.skilldistillery.jets.entites.SpaceField;
import com.skilldistillery.jets.entites.Ship;

public class ShipApplication {

	// -------------MAIN METHOD----------------------------
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		ShipApplication appMain = new ShipApplication();
		SpaceField appField = new SpaceField();

//		appField.populateSpaceField();
//		System.out.println(appField.getFleet().size());

		appField.populateSpaceField();
		System.out.println(appField.getFleet().size());

		// Keeps program running
		// terminates when user quits
		boolean runMenu = true;
		while (runMenu == true) {

			appMain.printMenu();

			char menuSelection = input.next().toUpperCase().charAt(0);

			// Switch to control menu input
			switch (menuSelection) {

			case 'A':
				appMain.listFleet(appField.getFleet());
				break;
			case 'B':
				appMain.flyShips(appField.getFleet());
				break;
			case 'C':
				appMain.shipSpeed(appField.getFleet());
				break;
			case 'D':
				appMain.shipWithLongestRange(appField.getFleet());
				break;
			case 'E':
				appMain.loadCargoShip();
				break;
			case 'F':
				appMain.fightersEngage();
				break;
			case 'G':
				appMain.addNewShip();
				break;
			case 'H':
				appMain.removeShip();
				break;
			case 'Q':
				System.out.println("Goodbye");
				input.close();
				runMenu = false;
				break;
			default:
				System.out.println("Invalid Option");

			}
		} // END OF MENU WHILE LOOP

	}

	// run Method
	private void run() {

	}

	// ----------------------METHODS-------------------------
	private void printMenu() {

		System.out.println();
		System.out.println("============== MENU ==============");
		System.out.println("|                                |");
		System.out.println("|  Enter A List Space Fleet      |");
		System.out.println("|  Enter B Deploy Fleet          |");
		System.out.println("|  Enter C Fastest Ship          |");
		System.out.println("|  Enter D Longest Range         |");
		System.out.println("|  Enter E Dog Fight             |");
		System.out.println("|  Enter F Add New Ship          |");
		System.out.println("|  Enter G Remove Ship           |");
		System.out.println("|  Enter Q  Exit                 |");
		System.out.println("|                                |");
		System.out.println("==================================");
		System.out.println();

	}

	private void listFleet(List<Ship> fleet) {

		List<Ship> displayFleet = fleet;

		// counter
		int i = 1;

		for (Ship ships : displayFleet) {
			System.out.println("-----------------------------------------------------------------------------");
			System.out.println("Index: " + i + " " + ships);
			System.out.println("-----------------------------------------------------------------------------");
			i++;
		}

	}

	private void flyShips(List<Ship> fleet) {
		// TODO Auto-generated method stub
		// Fly all Jets calls the fly() method on the entire fleet of jets.
		// fly() prints out the jet details and the amount of
		// time the jet can fly until it runs out of fuel (based on speed and range).
		List<Ship> flyFleet = fleet;

		// int[] range = new int[flyFleet.size()];
		int i = 0;
		int range = 0;
		double speed = 0;
		double flightTime = 0;
		for (Ship ships : flyFleet) {

			speed = (double) flyFleet.get(i).getSpeed();
			range = flyFleet.get(i).getRange();
			flightTime = (range / speed);
			System.out.println("-----------------------------------------------------------------------------");
			System.out.println("Index: " + i + " " + ships);
			System.out.println("-----------------------------------------------------------------------------");
			System.out.println("Launches, and light speed ahead!");
			System.out.println("Max Flight time: " + flightTime);
			System.out.println("-----------------------------------------------------------------------------");
			i++;

			// Darth Vader Noises
			// R2D2
			// Luke Skywalker
			// Tie Fighter sounds
			// Chewy Growl
		}

	}

	private void shipSpeed(List<Ship> fleet) {
		
		
		Ship fastestShip = null;
		double speed = 0;
		double maxSpeed = 0;
		for (Ship ships : shipSpeed) {
			speed = (double) flyFleet.get(i).getSpeed();
			speed = (double) shipRangeSpeed.get(i).getSpeed();
			

			if (speed < maxSpeed) {
				speed = maxSpeed;
				
				fastestShip = shipRangeSpeed.get(i);
		
		System.out.println("-----------------------------------------------------------------------------");
		System.out.println("                  ***FASTEST SHIP IN THE GALAXY***                           ");
		System.out.println("-----------------------------------------------------------------------------");
		System.out.println("Fastestship: " + fastestShip);
		System.out.println("-----------------------------------------------------------------------------");
		System.out.println("Speed: " + maxSpeed);
		System.out.println("Wooooooooow, thats like, so fast!");
		System.out.println("-----------------------------------------------------------------------------");
		
	}

	private void shipWithLongestRange(List<Ship> fleet) {
		//// The view fastest jet and longest range options both print out all of the
		//// information about a jet.
		// Note: these methods must search the collection of jets to find the
		// appropriate jet.
		List<Ship> shipRange = fleet;

		int i = 0;
		double currentMaxRange = 0;
		double newMaxRange = 0;
		Ship shipLongestRange = null;

		for (Ship ships : shipRange) {

			currentMaxRange = (double) shipRange.get(i).getSpeed();

			if (currentMaxRange < newMaxRange) {
				currentMaxRange = newMaxRange;

			}

		}

		System.out.println("");
		System.out.println("-----------------------------------------------------------------------------");
		System.out.println("               ***SHIP WITH THE MOST RANGE IN THE GALAXY***               ");
		System.out.println("-----------------------------------------------------------------------------");
		System.out.println("Fastestship: " + fastestShip);
		System.out.println("-----------------------------------------------------------------------------");
		System.out.println("Speed: " + maxSpeed);
		System.out.println("Wooooooooow, it can like, go so far!!");
		System.out.println("-----------------------------------------------------------------------------");

	}

	private void addNewShip() {
		// TODO Auto-generated method stub

	}

	private void loadCargoShip() {
		// TODO Auto-generated method stub

	}

	private void fightersEngage() {
		// TODO Auto-generated method stub

	}

	private void removeShip() {

	}

}