package lab8_9;
import java.awt.Color;
import se.lth.cs.ptdc.images.ImageFilter;

/** IdentityFilter beskriver en identitetstransformation */
public class GaussFilter extends ImageFilter {
	public GaussFilter(String name) {
		super(name);
	}
	
	public Color[][] apply(Color[][] inPixels, double paramValue) {
		int height = inPixels.length;
		int width = inPixels[0].length;
		short[][] redPixels = new short[height][width];
		short[][] greenPixels = new short[height][width];
		short[][] bluePixels = new short[height][width];
		for(int i = 0; i < height; i++) {
			for(int j = 0; j < width; j++) {
				Color pixel = inPixels[i][j];
				redPixels[i][j] = (short) pixel.getRed();
				greenPixels[i][j] = (short) pixel.getGreen();
				bluePixels[i][j] = (short) pixel.getBlue();
			}
		}
		short p1 = (short) paramValue;
		short[][] GAUSS_KERNEL = 
			{	{0, 1, 1, 0},
				{1, p1, p1, 1},
				{1, p1, p1, 1},
				{0, 1, 1, 0}
			};
		for(int i = 2; i < height - 2; i++) {
			for(int j = 2; j < width - 2; j++) {
				int sum = p1 * 4 + 8;
				redPixels[i][j] = convolve(redPixels, i, j, GAUSS_KERNEL, sum);
				greenPixels[i][j] = convolve(greenPixels, i, j, GAUSS_KERNEL, sum);
				bluePixels[i][j] = convolve(bluePixels, i, j, GAUSS_KERNEL, sum);
			}
		}
		
		Color[][] outPixels = new Color[height][width];
		for (int i = 0; i < height; i++) {
			for (int j = 0; j < width; j++) {
				int red = redPixels[i][j];
				int green = greenPixels[i][j];
				int blue = bluePixels[i][j];
				outPixels[i][j] = new Color(red, green, blue);
			}
		}
		return outPixels;
	}
}
