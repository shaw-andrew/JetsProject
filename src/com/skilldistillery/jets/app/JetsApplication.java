package com.skilldistillery.jets.app;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

import com.skilldistillery.jets.entities.Jet;


public class JetsApplication {


	public static void main(String[] args) {

		Scanner kb = new Scanner(System.in);
		JetsApplication ja = new JetsApplication();
	  //ja.loadPlanes();		
		ja.displayMenu();
	

		while (true) {

			switch (kb.nextInt()) {

			case 1:
				ja.addAJet();
				
				break;

			case 2:
				ja.flyAllJets();
				
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
				ja.addAJet();
				
				break;
				
			case 8:
				ja.removeAJet();
				
				break;
				
			case 9:
				// Exit
				System.out.println("You chose to exit. Goodbye.");
				kb.close();
				System.exit(0);
				break;

			// Statement for invalid selection.
			default:
				System.out.println("Invalid selection, please select another option.");
			}

		}

	}

	public void displayMenu() {
		System.out.println(" ---------------------------------- ");
		System.out.println(" |             MENU               | ");
		System.out.println(" |                                | ");
		System.out.println(" | 1: List fleet                  | ");
		System.out.println(" | 2: Fly all Jets                | ");
		System.out.println(" | 3: View fastest jet            | ");
		System.out.println(" | 4: View Jet with Longest Range | ");
		System.out.println(" | 5: *Load cargo planes*         | ");
		System.out.println(" | 6: *Dogfight*                  | ");
		System.out.println(" | 7: Add a jet to the fleet      | ");
		System.out.println(" | 8: Remove a Jet from the fleet | ");
		System.out.println(" | 9: Quit                        | ");
		System.out.println(" |                                | ");
		System.out.println(" ---------------------------------- ");
	}
	
	public void listFleet() {
		
	}
	
	public void flyAllJets() {
		
	}
	
	public void viewFastestJet() {
		
	}
	
	public void viewLongestRange() {
		
	}
	
	public void loadCargoPlanes() {
		
	}
	
	public void splashLanding() {
		
	}
	
	public void addAJet() {
		
	}
	
	public void removeAJet() {
		
	}
	

	
}
