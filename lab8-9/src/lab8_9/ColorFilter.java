package lab8_9;
import java.awt.Color;
import se.lth.cs.ptdc.images.ImageFilter;

/** IdentityFilter beskriver en identitetstransformation */
public class ColorFilter extends ImageFilter {
	public ColorFilter(String name) {
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
				int a = (int) (paramValue / 100);
				int b = (int) ((paramValue - a * 100) / 10);
				int c = (int) (paramValue - a * 100 - b * 10);
				outPixels[i][j] = new Color(a * pixel.getRed(), b * pixel.getGreen(), c * pixel.getBlue());
			}
		}
		return outPixels;
	}
}
