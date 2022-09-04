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

	public ArrayList<Jet> getPlanes(List<Jet> airfield) {
		ArrayList<Jet> jetCopy = null;
		for (Jet jet : airfield) {
			jetCopy.add(jet);
		}
		return jetCopy;
	}

	public List<Jet> getAirfield() {
		return planes;
	}

	public void setAirfield(List<Jet> airfield) {
		this.planes = airfield;
	}

	public void addAJet(Scanner kb) {
		System.out.println(
				"What style of jet would you like to add? You can choose Passenger Jet, Cargo Jet or Sea Plane.");
		String input = kb.nextLine();
		kb.nextLine();
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
		Jet newJet = null;
		switch (input.toLowerCase()) {
		case "cargo jet":
			System.out.println("You selected a Cargo Jet.");
			newJet = new CargoJet();
			break;

		case "passenger jet":
			System.out.println("You selected a Passenger Jet.");
			newJet = new JetImpl();
			break;

		case "sea plane":
			System.out.println("You selected a Sea Plane.");
			newJet = new SeaPlane();
			break;

		default:
			System.out.println("Invalid selection");
			break;
		}
		return newJet;

	}

}