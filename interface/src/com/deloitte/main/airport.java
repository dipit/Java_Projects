package com.deloitte.main;

public class airport {
	public static void main(String[] args) {
		airport metropolisAirpots = new airport();
		helicopter copter = new helicopter();
		seaplane seaPlane = new seaplane();

		metropolisAirpots.givePermissionToLand(copter);
		metropolisAirpots.givePermissionToLand(seaPlane);

	}

	private void givePermissionToLand(Flyer f) {
       f.land();
	}
}
