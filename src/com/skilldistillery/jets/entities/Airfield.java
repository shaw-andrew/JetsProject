package com.skilldistillery.jets.entities;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Airfield {

	public Airfield() {
		planes = new ArrayList<>();
		loadPlanes();
	}

	private List<Jet> planes;

	public void loadPlanes() {
		// IO try/catch to read in initial planes in from jets.txt
		try (BufferedReader bufIn = new BufferedReader(new FileReader("jets.txt"))) {
			String line;
			while ((line = bufIn.readLine()) != null) {
				Jet initialPlane = null;
				String[] jetInfo = line.split(",");
				initialPlane = getJetType(jetInfo[0]);
				initialPlane.setModel(jetInfo[1]);
				initialPlane.setSpeed(Double.parseDouble(jetInfo[2]));
				initialPlane.setRange(Integer.parseInt(jetInfo[3]));
				initialPlane.setPrice(Long.parseLong(jetInfo[4]));
				planes.add(initialPlane);
			}
		} catch (IOException e) {
			System.err.println(e);
		}
	}

	public List<Jet> getAirfield() {
		return planes;
	}

	public void addAJet(Scanner kb) {
		System.out.println(
				"What style of jet would you like to add? You can choose Passenger Jet, Cargo Jet or Sea Plane.");
		// Flush scanner
		kb.nextLine();
		String input = kb.nextLine();
		Jet newJet = getJetType(input);
		
		System.out.println("Please input the model of the new jet");
		newJet.setModel(kb.nextLine());
		System.out.println("What is this model's top speed?");
		newJet.setSpeed(kb.nextDouble());
		System.out.println("What is the range on this bad boy?");
		newJet.setRange(kb.nextInt());
		System.out.println("How much would one of these babys cost?");
		newJet.setPrice(kb.nextLong());
		planes.add(newJet);
	}

	public Jet getJetType(String input) {
		Scanner kb = new Scanner(System.in);
		Jet newJet = null;
		while(true) {
		switch (input.toLowerCase()) {
		case "cargo jet":
			newJet = new CargoJet();
			break;

		case "passenger jet":
			newJet = new JetImpl();
			break;

		case "sea plane":
			newJet = new SeaPlane();
			break;

		default:
			System.out.println("Invalid plane type, please try agian");
			input = kb.nextLine().toLowerCase();
			continue;
		}
		
		return newJet;}
	}

	public void removeAJet(Scanner kb) {
		System.out.println("Please enter the number of the plane you would like to remove.");
		int counter = 0;
		for (Jet jet : planes) {
			System.out.println(counter + " " + jet.getModel());
			counter++;
		}
		int input = kb.nextInt();
		while (true) {
			if (input > planes.size() - 1) {
				System.out.println("Invalid selection, please try again.");
				input = kb.nextInt();
			} else {
				planes.remove(input);
				System.out.println("Consider it done. Please select the next menu task.");
				break;
			}
		}
	}
}