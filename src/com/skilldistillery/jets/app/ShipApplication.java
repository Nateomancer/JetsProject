package com.skilldistillery.jets.app;

//reader
import java.io.BufferedReader;
import java.io.FileReader;
//Exceptions
import java.io.IOException;
//iterator
//import java.util.Iterator;
//lists
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
//other classes
import com.skilldistillery.jets.entites.SpaceField;
import com.skilldistillery.jets.entites.FreighterShip;
import com.skilldistillery.jets.entites.ImperialShip;
import com.skilldistillery.jets.entites.RebelFighter;
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
			input.nextLine();

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
				appMain.maxShipRange(appField.getFleet());
				break;
			case 'E':
				appMain.loadCargoShip(appField.getFleet());
				break;
			case 'F':
				appMain.destroyDeathStar(appField.getFleet());
				break;
			case 'G':
				// appField.getFleet(),
				appMain.addNewShip(appField.getFleet());

				break;
			case 'H':
				appMain.removeShip(appField.getFleet());
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
		System.out.println("|  Enter E Load Cargo            |");
		System.out.println("|  Enter F DeathStar  Assault    |");
		System.out.println("|  Enter G Add New Ship          |");
		System.out.println("|  Enter H Remove Ship           |");
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
			if (ships instanceof RebelFighter && ships.getModel().contains("X-Wing")) {
				System.out.println("Rouge leader, standing by");
				System.out.println("R2D2 NOISES");
			}
			System.out.println("-----------------------------------------------------------------------------");
			i++;

		}

	}

	private void shipSpeed(List<Ship> fleet) {

		int i = 0;
		int maxIndex = 0;
		double speed = 0;
		double newMaxSpeed = 0;
		List<Ship> shipSpeed = fleet;

		for (Ship ships : shipSpeed) {

			speed = shipSpeed.get(i).getSpeed();

			if (speed > newMaxSpeed) {
				newMaxSpeed = speed;
				maxIndex = i;

			}
			i++;
		}

		System.out.println("-----------------------------------------------------------------------------");
		System.out.println("                  ***FASTEST SHIP IN THE GALAXY***                           ");
		System.out.println("-----------------------------------------------------------------------------");
		System.out.println("Fastest Ship: " + shipSpeed.get(maxIndex));
		System.out.println("-----------------------------------------------------------------------------");
		System.out.println("Speed: " + newMaxSpeed);
		System.out.println("Wooooooooow, thats like, so fast!");
		System.out.println("-----------------------------------------------------------------------------");

	}

	private void maxShipRange(List<Ship> fleet) {
		//// The view fastest jet and longest range options both print out all of the
		//// information about a jet.
		// Note: these methods must search the collection of jets to find the
		// appropriate jet.
		int i = 0;
		int maxIndex = 0;
		int range = 0;
		int newMaxRange = 0;
		List<Ship> shipRange = fleet;

		for (Ship ships : shipRange) {

			range = shipRange.get(i).getRange();

			if (range > newMaxRange) {
				newMaxRange = range;
				maxIndex = i;

			}
			i++;
		}
		System.out.println(newMaxRange + " " + i + "  " + maxIndex);
		System.out.println(shipRange.get(maxIndex));
		System.out.println("");
		System.out
				.println("------------------------------------------------------------------------------------------");
		System.out.println("               ***SHIP WITH THE MOST RANGE IN THE GALAXY***");
		System.out
				.println("------------------------------------------------------------------------------------------");
		System.out.println("Ship with longest range: " + shipRange.get(maxIndex));
		System.out
				.println("------------------------------------------------------------------------------------------");
		System.out.println("Range: " + newMaxRange);
		System.out.println("Wooooooooow, it can like, go so far!!");
		System.out
				.println("------------------------------------------------------------------------------------------");

	}

	private List<Ship> addNewShip(List<Ship> fleet) {
		// TODO Auto-generated method stub
		// List<Ship> addShip = fleet;
		// List<Ship> fleet,

		Scanner input = new Scanner(System.in);
		List<Ship> addShip = fleet;

		Ship ship = null;

		System.out.println();
		System.out.println("============== MENU ==============");
		System.out.println("|                                |");
		System.out.println("|  Enter A Add Imperial Ship     |");
		System.out.println("|  Enter B Add Freighter Ship    |");
		System.out.println("|  Enter C Add Rebel Ship        |");
		System.out.println("|  Enter D Add Space Ship        |");
		System.out.println("|                                |");
		System.out.println("==================================");
		System.out.println("**What kind of ship do you want to add?**");
		System.out.println("**Please Enter A, B, C, or D**");

		char menuSelection = input.next().toUpperCase().charAt(0);
		// input.next();
		String model;
		double speed;
		int range;
		long price;

		// Switch to control menu input
		switch (menuSelection) {

		case 'A':

			System.out.println("Enter Ship Model");
			input.nextLine();
			model = input.nextLine();
			System.out.println("Enter Speed");
			speed = input.nextDouble();
			System.out.println("Enter Ship Range");
			range = input.nextInt();
			System.out.println("Enter Price");
			price = input.nextLong();
			System.out.println(model + speed + range + price);
			ship = new FreighterShip(model, speed, range, price);
			break;

		case 'B':
			System.out.println("Enter Ship Model");
			model = input.nextLine();
			System.out.println("Enter Speed");
			speed = input.nextDouble();
			System.out.println("Enter Ship Range");
			range = input.nextInt();
			System.out.println("Enter Price");
			price = input.nextLong();
			ship = new FreighterShip(model, speed, range, price);
			break;

		case 'C':
			System.out.println("Enter Ship Model");
			model = input.nextLine();
			System.out.println("Enter Speed");
			speed = input.nextDouble();
			System.out.println("Enter Ship Range");
			range = input.nextInt();
			System.out.println("Enter Price");
			price = input.nextLong();
			ship = new RebelFighter(model, speed, range, price);
			break;

		case 'D':
			// new ship
			break;
		case 'E':
			// quit
			break;
		default:
			System.out.println("Invalid Option");

		}
		addShip.add(ship);
		input.close();
		return addShip;

	}

	private List<Ship> removeShip(List<Ship> fleet) {

		Scanner input = new Scanner(System.in);

		List<Ship> removeShip = fleet;

		int i = 0;
		System.out.println("Enter the index of the ship you wish to remove");

		for (Ship ships : removeShip) {

			System.out.println("Index: " + i + " " + ships);

			i++;

		}

		int removeShipIndex = input.nextInt();
		input.nextLine();

		removeShip.remove(removeShipIndex);

		return removeShip;
	}

	private void loadCargoShip(List<Ship> fleet) {
		List<Ship> loadFleet = fleet;

		for (Ship ship : loadFleet) {
			if (ship instanceof FreighterShip) {
				System.out.println("The " + ship.getModel());
				((FreighterShip) ship).loadCargo();
			}

		}
	}

	private void destroyDeathStar(List<Ship> fleet) {
		// TODO Auto-generated method stub

		List<Ship> rebelFleet = fleet;

		for (Ship ship : rebelFleet) {
			if (ship instanceof RebelFighter) {
				System.out.println("The " + ship.getModel());
				((RebelFighter) ship).deathStar();
				if (ship instanceof RebelFighter && ship.getModel().contains("X-Wing")) {
					System.out.println("Rouge leader, standing by");
					System.out.println("R2D2 NOISES");

				}

			}
		}
		System.out.println("");
		System.out.println(
				"This is Red Leader--All fighters, on me--we need to make an attack run on the Death Star, push those TIEs back.");
		System.out.println("");
		System.out.println(" Luke's torpedoes shoot toward the port and seems to simply \n"
				+ "disappear into the surface and not explode. But the shots do \n"
				+ "find their mark and have gone into the exhaust port and are \n" + "heading for the main reactor.");

		System.out.println("\nDeath Star Destroyed");

		System.out.println("\nThe Rebel ships race out of sight, leaving the moon-like \n"
				+ "Death Star alone against a blanket of stars. Several small \n"
				+ "flashes appear on the surface. The Death Star bursts into a \n"
				+ "supernova, creating a spectacular heavenly display.");

	}

}