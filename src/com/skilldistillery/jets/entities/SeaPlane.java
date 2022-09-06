package com.skilldistillery.jets.entities;

public class SeaPlane extends Jet implements FloatationDevice {

	public SeaPlane() {}
	public SeaPlane(String model, double speed, int range, long price) {
		super(model, speed, range, price);
	}

	@Override
	public String splashLanding() {
		return " \"Whoa bro, this is the captain. Look out your window to scope some gnarly 4 foot overheads. Time to get pitted.\"";

	}
}
