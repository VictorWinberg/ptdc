package lab8_9;
import java.awt.Color;
import se.lth.cs.ptdc.images.ImageFilter;

/** IdentityFilter beskriver en identitetstransformation */
public class ShatterFilter extends ImageFilter {
	public ShatterFilter(String name) {
		super(name);
	}
	
	public Color[][] apply(Color[][] inPixels, double paramValue) {
		int height = inPixels.length;
		int width = inPixels[0].length;
		Color[][] outPixels = new Color[height][width];
		for (int i = 0; i < height; i++) {
			for (int j = 0; j < width; j++) {
				Color pixel = inPixels[i][j];
				int r = pixel.getRed();
				if(r % paramValue == 0) r = 255;
				int g = pixel.getBlue();
				if(g % paramValue == 0) g = 255;
				int b = pixel.getBlue();
				if(b % paramValue == 0) b = 255;
				outPixels[i][j] = new Color(r, g, b);
			}
		}
		return outPixels;
	}
}
