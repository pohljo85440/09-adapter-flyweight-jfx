package ohm.softa.a09.model;

import javafx.scene.image.Image;
import ohm.softa.a09.resource.FxImageLoaderAdapter;

public class FighterImage {
	private final Image image;

	FighterImage (String url, FxImageLoaderAdapter imageResourceLoader) {
		image =  imageResourceLoader.loadImage(url);
	}

	public Image getImage() {
		return image;
	}
}
