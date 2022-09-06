package com.skilldistillery.jets.entities;

public class CargoJet extends Jet implements CargoBay {

	public CargoJet() {}
	public CargoJet(String model, double speed, int range, long price) {
		super(model, speed, range, price);
	}

	@Override
	public String loadCargo() {
		return " cargo bay is full.";
	}

}
