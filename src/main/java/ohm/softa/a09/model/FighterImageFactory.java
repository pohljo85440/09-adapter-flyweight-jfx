package ohm.softa.a09.model;

import java.util.HashMap;
import java.util.Map;

public class FighterImageFactory {
	private final Map<String, FighterImage> fighterImageMap = new HashMap<>();

	FighterImage getFighterImage(String url) {
		if(fighterImageMap.containsKey(url)) {
			return fighterImageMap.get(url);
		}

		FighterImage newFighterImage = new FighterImage(url);
		fighterImageMap.put(url, newFighterImage);

		return newFighterImage;
	}
}
