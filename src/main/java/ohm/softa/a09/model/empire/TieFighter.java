package ohm.softa.a09.model.empire;

import ohm.softa.a09.model.Fighter;
import ohm.softa.a09.model.FighterImage;
import ohm.softa.a09.model.Force;

public class TieFighter extends Fighter {

	public TieFighter(String pilot, FighterImage fighterImage) {
		super(pilot, fighterImage);
	}

	@Override
	public Force getSideOfForce() {
		return Force.DarkSide;
	}

	@Override
	public String getFighterType() {
		return "Tie Fighter";
	}
}
