package com.skilldistillery.jets.entites;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;
import com.skilldistillery.jets.entites.Ship;
import com.skilldistillery.jets.app.ShipApplication;

//airField
public class SpaceField {
	// encapsulated
	// empty array of ships
	private List<Ship> fleet = new ArrayList<>();

	public List<Ship> getFleet() {
		return fleet;
	}

	public void setFleet(List<Ship> fleet) {
		this.fleet = fleet;
	}

//--METHODS--
	@Override
	public String toString() {
		return "SpaceField [fleet=" + fleet + "]";
	}

//Reads Jets.txt
//Instantiates Ships
	public void populateSpaceField() {

		// read jets.txt
		try (BufferedReader reader = new BufferedReader(new FileReader("jets.txt"))) {

			String lineJets;
			// continues until null
			while ((lineJets = reader.readLine()) != null) {
				// line counter

				// check for string containing
				// split sting into 5 strings
				// call constructor

				String[] strSplitter = lineJets.split(",");

				if (strSplitter[0].contains("Imperial-Cruiser")) {

					System.out.println(strSplitter[0]);
					Ship imperialShip = new ImperialShip(strSplitter[1], Double.parseDouble(strSplitter[2]),
							Integer.parseInt(strSplitter[3]), Long.parseLong(strSplitter[4]));

					fleet.add(imperialShip);

				} else if (lineJets.contains("Imperial-Fighter")) {

					// String[] strSplitter = lineJets.split(",");
					Ship imperialShip = new ImperialShip(strSplitter[1], Double.parseDouble(strSplitter[2]),
							Integer.parseInt(strSplitter[3]), Long.parseLong(strSplitter[4]));
					fleet.add(imperialShip);

				} else if (lineJets.contains("Freighter-Ship")) {

					// String[] strSplitter = lineJets.split(",");
					Ship FreighterShip = new FreighterShip(strSplitter[1], Double.parseDouble(strSplitter[2]),
							Integer.parseInt(strSplitter[3]), Long.parseLong(strSplitter[4]));
					fleet.add(FreighterShip);

				} else if (lineJets.contains("Rebel-Fighter")) {

					// String[] strSplitter = lineJets.split(",");
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
