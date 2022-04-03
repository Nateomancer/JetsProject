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
				appMain.flyShips();
				break;
			case 'C':
				appMain.shipWithLongestRange();
				break;
			case 'D':
				appMain.loadCargoShip();
				break;
			case 'E':
				appMain.fightersEngage();
				break;
			case 'F':
				appMain.addNewShip();
				break;
			case 'G':
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

		List<Ship> display = fleet;

		for (Ship ships : display) {

			System.out.println(ships);
		}

	}

	private void removeShip() {
		// TODO Auto-generated method stub

	}

	private void addNewShip() {
		// TODO Auto-generated method stub

	}

	private void fightersEngage() {
		// TODO Auto-generated method stub

	}

	private void loadCargoShip() {
		// TODO Auto-generated method stub

	}

	private void shipWithLongestRange() {
		// TODO Auto-generated method stub

	}

	private void flyShips() {
		// TODO Auto-generated method stub

	}

	// ----------------------METHODS-------------------------

}