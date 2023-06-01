package ohm.softa.a09.model;

import javafx.scene.image.Image;
import ohm.softa.a09.resource.ResourceLoader;

public class FighterImage {
	private final Image image;
	private final ResourceLoader<Image> imageResourceLoader;

	FighterImage (String url) {
		imageResourceLoader = new ResourceLoader<>(Image::new);
		image =  imageResourceLoader.loadResource(ClassLoader.getSystemClassLoader(), url);
	}

	public Image getImage() {
		return image;
	}
}
