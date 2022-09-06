package com.skilldistillery.jets.app;

import java.text.DecimalFormat;
import java.util.List;
import java.util.Scanner;

import com.skilldistillery.jets.entities.Airfield;
import com.skilldistillery.jets.entities.CargoBay;
import com.skilldistillery.jets.entities.CargoJet;
import com.skilldistillery.jets.entities.FloatationDevice;
import com.skilldistillery.jets.entities.Jet;
import com.skilldistillery.jets.entities.SeaPlane;

public class JetsApplication {
	Airfield airfield = new Airfield();

	public static void main(String[] args) {

		Scanner kb = new Scanner(System.in);
		JetsApplication ja = new JetsApplication();
		ja.displayMenu();

		while (true) {

			switch (kb.nextInt()) {

			case 1:
				ja.listFleet();
				break;

			case 2:
				ja.fly();
				break;

			case 3:
				ja.viewFastestJet();
				break;

			case 4:
				ja.viewLongestRange();
				break;

			case 5:
				ja.loadCargoPlanes();
				break;

			case 6:
				ja.splashLanding();
				break;

			case 7:
				ja.addAJet(kb);
				break;

			case 8:
				ja.removeAJet(kb);
				break;

			case 9:
				System.out.println("You chose to exit. Goodbye.");
				kb.close();
				System.exit(0);
				break;

			default:
				System.out.println("Invalid selection, please try again.");
			}
		}
	}

	public void displayMenu() {
		System.out.println(" ---------------------------------- ");
		System.out.println(" |                                | ");
		System.out.println(" |             MENU               | ");
		System.out.println(" |                                | ");
		System.out.println(" | 1: List fleet                  | ");
		System.out.println(" | 2: Fly all Jets                | ");
		System.out.println(" | 3: View fastest jet            | ");
		System.out.println(" | 4: View Jet with Longest Range | ");
		System.out.println(" | 5: Load cargo planes           | ");
		System.out.println(" | 6: Splash landing              | ");
		System.out.println(" | 7: Add a jet to the fleet      | ");
		System.out.println(" | 8: Remove a Jet from the fleet | ");
		System.out.println(" | 9: Quit                        | ");
		System.out.println(" |                                | ");
		System.out.println(" ---------------------------------- ");
	}

	public void listFleet() {
		for (Jet plane : airfield.getAirfield()) {
			System.out.println(plane.toString());
		}
	}

	public void fly() {
		List<Jet> jets = airfield.getAirfield();
		for (Jet plane : jets) {
			double timeInAir = plane.getRange() / plane.getSpeed();
			DecimalFormat f = new DecimalFormat("##.00");
			String roundedTime = f.format(timeInAir);
			System.out.println("The " + plane.getModel() + " can fly for " + roundedTime + " hours before running out of fuel.");
		}
	}

	public void viewFastestJet() {
		List<Jet> jets = airfield.getAirfield();
		Jet fastestJet = null;
		for (Jet plane : jets) {
			if (fastestJet == null) {
				fastestJet = plane;
			}
			if (plane.getSpeed() > fastestJet.getSpeed()) {
				fastestJet = plane;
			}
		}
		System.out.println(
				fastestJet.getModel() + " has the highest top speed at: " + fastestJet.getSpeed() + " miles per hour.");
	}

	public void viewLongestRange() {
		List<Jet> jets = airfield.getAirfield();
		Jet longestRange = null;
		for (Jet plane : jets) {
			if (longestRange == null) {
				longestRange = plane;
			}
			if (plane.getRange() > longestRange.getRange()) {
				longestRange = plane;
			}
		}
		System.out
				.println(longestRange.getModel() + " has the longest range at: " + longestRange.getRange() + " miles.");
	}

	public void loadCargoPlanes() {
		CargoJet cj = new CargoJet();
		List<Jet> jets = airfield.getAirfield();
		for (Jet jet : jets) {
			if (jet instanceof CargoBay) {
				System.out.println(jet.getModel() + cj.loadCargo());
			}
		}
	}

	public void splashLanding() {
		SeaPlane sp = new SeaPlane();
		List<Jet> jets = airfield.getAirfield();
		for (Jet jet : jets) {
			if (jet instanceof FloatationDevice) {
				System.out.println(jet.getModel() + sp.splashLanding());
			}
		}
	}

	private void addAJet(Scanner kb) {
		airfield.addAJet(kb);
	}

	public void removeAJet(Scanner kb) {
		airfield.removeAJet(kb);
	}
	
}
