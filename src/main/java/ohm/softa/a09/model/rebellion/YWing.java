package ohm.softa.a09.model.rebellion;

import ohm.softa.a09.model.Fighter;
import ohm.softa.a09.model.FighterImage;
import ohm.softa.a09.model.Force;

public class YWing extends Fighter {

	public YWing(String pilot, FighterImage fighterImage) {
		super(pilot, fighterImage);
	}

	@Override
	public Force getSideOfForce() {
		return Force.LightSide;
	}

	@Override
	public String getFighterType() {
		return "Y-Wing";
	}
}
