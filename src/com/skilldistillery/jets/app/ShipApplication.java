package com.skilldistillery.jets.app;

//input/output to text
import java.io.BufferedReader;
import java.io.FileReader;
//Exceptions
import java.io.IOException;
//iterator
import java.util.Iterator;
//lists
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
//set
import java.util.Set;
import java.util.TreeSet;

import com.skilldistillery.jets.entites.SpaceField;
import com.skilldistillery.jets.entites.FreighterShip;
import com.skilldistillery.jets.entites.ImperialShip;
import com.skilldistillery.jets.entites.RebelFighter;
import com.skilldistillery.jets.entites.Ship;

public class ShipApplication {

	// -------------MAIN METHOD----------------------------
	public static void main(String[] args) {

		ShipApplication app = new ShipApplication();

		app.run();
	}

	// ----------------------METHODS-------------------------
	// run Method
	private void run() {

		// read jets.txt
		try (BufferedReader reader = new BufferedReader(new FileReader("jets.txt"))) {

			String lineJets;
			// continues until null
			int i = 0;
			while ((lineJets = reader.readLine()) != null) {
				// line counter
				i++;

				// reader
				System.out.println("READER");
				System.out.println("Line " + i + " " + lineJets);
				System.out.println("-----------------------------------------------------------------------");

				System.out.println("---Printing AFTER SPLIT---");
				// check for string containing
				// split sting into 5 strings
				// call constructor
				if (lineJets.contains("Imperial-Cruiser")) {

					String[] strSplitter = lineJets.split(",", 5);
					Ship imperialShip = new ImperialShip(strSplitter[1], Double.parseDouble(strSplitter[2]),
							Integer.parseInt(strSplitter[3]), Long.parseLong(strSplitter[4]));
					setFleet().add(imperialShip);

					System.out.println("-----------------------------------------------------------------------");

				} else if (lineJets.contains("Imperial-Fighter")) {

					String[] strSplitter = lineJets.split(",", 5);
					Ship imperialShip = new ImperialShip(strSplitter[1], Double.parseDouble(strSplitter[2]),
							Integer.parseInt(strSplitter[3]), Long.parseLong(strSplitter[4]));
					fleet.add(imperialShip);

				} else if (lineJets.contains("Freighter-Ship")) {

					String[] strSplitter = lineJets.split(",", 5);
					Ship FreighterShip = new FreighterShip(strSplitter[1], Double.parseDouble(strSplitter[2]),
							Integer.parseInt(strSplitter[3]), Long.parseLong(strSplitter[4]));
					fleet.add(FreighterShip);

				} else if (lineJets.contains("Rebel-Fighter")) {

					String[] strSplitter = lineJets.split(",", 5);
					Ship RebelFighter = new RebelFighter(strSplitter[1], Double.parseDouble(strSplitter[2]),
							Integer.parseInt(strSplitter[3]), Long.parseLong(strSplitter[4]));
					fleet.add(RebelFighter);

				} else {
					System.out.println("Ship not found");
					continue;
				}

			} // WHILELOOP

		} // TRY BLOCK

		catch (IOException e) {
			System.err.println(e);
		} // CATCH BLOCK
	}// RUN METHOD

}
