package ohm.softa.a09.model;

import ohm.softa.a09.resource.FxImageLoaderAdapter;

import java.util.HashMap;
import java.util.Map;

public class FighterImageFactory {
	private final Map<String, FighterImage> fighterImageMap = new HashMap<>();
	private final FxImageLoaderAdapter imageResourceLoader;

	FighterImageFactory() {
		imageResourceLoader = new FxImageLoaderAdapter();
	}

	FighterImage getFighterImage(String url) {
		if(fighterImageMap.containsKey(url)) {
			return fighterImageMap.get(url);
		}

		FighterImage newFighterImage = new FighterImage(url, imageResourceLoader);
		fighterImageMap.put(url, newFighterImage);

		return newFighterImage;
	}
}
