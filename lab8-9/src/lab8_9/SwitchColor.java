package lab8_9;
import java.awt.Color;
import se.lth.cs.ptdc.images.ImageFilter;

/** IdentityFilter beskriver en identitetstransformation */
public class SwitchColor extends ImageFilter {
	public SwitchColor(String name) {
		super(name);
	}
	
	public Color[][] apply(Color[][] inPixels, double paramValue) {
		int height = inPixels.length;
		int width = inPixels[0].length;
		Color[][] outPixels = new Color[height][width];
		for (int i = 0; i < height; i++) {
			for (int j = 0; j < width; j++) {
				Color pixel = inPixels[i][j];
				if(paramValue > 111) paramValue = 111;
				int r1 = (int) (paramValue / 100);
				int g1 = (int) ((paramValue - r1 * 100) / 10);
				int b1 = (int) (paramValue - r1 * 100 - g1 * 10);
				int r = pixel.getRed();
				int g = pixel.getGreen();
				int b = pixel.getBlue();
				if(r1 == 0) r = pixel.getRed();
				else if(g1 == 1) r = pixel.getGreen();
				else if(b1 == 1) r = pixel.getBlue();
				if(g1 == 0) g = pixel.getGreen();
				else if(r1 == 1) g = pixel.getRed();
				else if(b1 == 1) g = pixel.getBlue();
				if(b1 == 0) b = pixel.getBlue();
				else if(r1 == 1) b = pixel.getRed();
				else if(g1 == 1) b = pixel.getBlue();
				outPixels[i][j] = new Color(r, g, b);
			}
		}
		return outPixels;
	}
}
