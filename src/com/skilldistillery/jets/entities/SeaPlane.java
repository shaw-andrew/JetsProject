package com.skilldistillery.jets.entities;

public class SeaPlane extends Jet implements FloatationDevice {

	public SeaPlane(String model, double speed, int range, long price) {
		super(model, speed, range, price);
	}

	@Override
	public void splashLanding() {
		System.out.println("Whoa bro, we got a splashdown. Look out the window to check some gnarly 6' overheads. Time to get pitted.");

	}

}
