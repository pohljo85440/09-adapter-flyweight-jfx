package ohm.softa.a09.model.rebellion;

import ohm.softa.a09.model.Fighter;
import ohm.softa.a09.model.FighterImage;
import ohm.softa.a09.model.Force;

public class AWing extends Fighter {

	public AWing(String pilot, FighterImage fighterImage) {
		super(pilot, fighterImage);
	}

	@Override
	public Force getSideOfForce() {
		return Force.LightSide;
	}

	@Override
	public String getFighterType() {
		return "A-Wing";
	}
}
