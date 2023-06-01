package ohm.softa.a09.model.empire;

import ohm.softa.a09.model.Fighter;
import ohm.softa.a09.model.FighterImage;
import ohm.softa.a09.model.Force;

/**
 * @author Peter Kurfer
 */

public class TieBomber extends Fighter {

	public TieBomber(String pilot, FighterImage fighterImage) {
		super(pilot, fighterImage);
	}

	@Override
	public Force getSideOfForce() {
		return Force.DarkSide;
	}

	@Override
	public String getFighterType() {
		return "Tie Bomber";
	}
}
