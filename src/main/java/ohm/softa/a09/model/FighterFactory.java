package ohm.softa.a09.model;

import ohm.softa.a09.model.empire.TieBomber;
import ohm.softa.a09.model.empire.TieFighter;
import ohm.softa.a09.model.empire.TieInterceptor;
import ohm.softa.a09.model.rebellion.AWing;
import ohm.softa.a09.model.rebellion.XWing;
import ohm.softa.a09.model.rebellion.YWing;
import ohm.softa.a09.util.NameGenerator;

import java.util.Random;

/**
 * Factory to create new fighters
 * Creates random fighters
 *
 * @author Peter Kurfer
 */
public final class FighterFactory {

	private static final int NumberOfKnownFighterTypes = 6;
	private final Random random;
	private final NameGenerator nameGenerator;
	private final FighterImageFactory fighterImageFactory;

	public FighterFactory() {
		nameGenerator = new NameGenerator();
		random = new Random();
		fighterImageFactory = new FighterImageFactory();
	}

	/**
	 * Create a random Fighter
	 *
	 * @implNote the method has an implementation flaw because it always loads the fighters image
	 * @return a new Fighter instance
	 */
	public Fighter createFighter() {
		switch (random.nextInt(NumberOfKnownFighterTypes)) {
			case 0:
				return new AWing(nameGenerator.generateName(), fighterImageFactory.getFighterImage("fighter/awing.jpg"));
			case 1:
				return new XWing(nameGenerator.generateName(), fighterImageFactory.getFighterImage("fighter/xwing.jpg"));
			case 2:
				return new YWing(nameGenerator.generateName(), fighterImageFactory.getFighterImage("fighter/ywing.jpg"));
			case 3:
				return new TieBomber(nameGenerator.generateName(), fighterImageFactory.getFighterImage("fighter/tiebomber.jpg"));
			case 4:
				return new TieFighter(nameGenerator.generateName(), fighterImageFactory.getFighterImage("fighter/tiefighter.jpg"));
			default:
				return new TieInterceptor(nameGenerator.generateName(), fighterImageFactory.getFighterImage("fighter/tieinterceptor.jpg"));
		}
	}
}
