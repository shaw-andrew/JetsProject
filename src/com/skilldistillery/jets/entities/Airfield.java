package com.skilldistillery.jets.entities;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public abstract class Airfield {
	private List<Jet> airfield;

	public void loadPlanes() {

		try (BufferedReader bufIn = new BufferedReader(new FileReader("jets.txt"))) {
			String line;
			while ((line = bufIn.readLine()) != null) {
				airfield.add(airfield);
			}
		} catch (IOException e) {
			System.err.println(e);
		}
	}
}