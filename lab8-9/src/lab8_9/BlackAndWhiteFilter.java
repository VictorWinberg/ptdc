package lab8_9;
import java.awt.Color;
import se.lth.cs.ptdc.images.ImageFilter;

/** IdentityFilter beskriver en identitetstransformation */
public class BlackAndWhiteFilter extends ImageFilter {
	public BlackAndWhiteFilter(String name) {
		super(name);
	}
	
	public Color[][] apply(Color[][] inPixels, double paramValue) {
		int height = inPixels.length;
		int width = inPixels[0].length;
		Color[][] outPixels = new Color[height][width];
		for (int i = 0; i < height; i++) {
			for (int j = 0; j < width; j++) {
				Color pixel = inPixels[i][j];
				int x = 0;
				int r = pixel.getRed();
				int g = pixel.getGreen();
				int b = pixel.getBlue();
				int intensity = (r + g + b) / 3;
				if(intensity > paramValue) x = 255;
				outPixels[i][j] = new Color(x, x, x);
			}
		}
		return outPixels;
	}
}
