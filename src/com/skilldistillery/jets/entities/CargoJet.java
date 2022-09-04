package com.skilldistillery.jets.entities;

public class CargoJet extends Jet implements CargoBay {

	public CargoJet() {}
	public CargoJet(String model, double speed, int range, long price) {
		super(model, speed, range, price);
	}

	@Override
	public void loadCargo() {
		System.out.println("Cargo bay is full");
	}

}
