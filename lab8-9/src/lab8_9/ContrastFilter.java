package lab8_9;

import java.awt.Color;
import se.lth.cs.ptdc.images.ImageFilter;

/** ContrastFilter */
public class ContrastFilter extends ImageFilter {
	public ContrastFilter(String name) {
		super(name);
	}

	public Color[][] apply(Color[][] inPixels, double paramValue) {
		int height = inPixels.length;
		int width = inPixels[0].length;
		short[][] intensity = computeIntensity(inPixels);
		int[] histogram = new int[256];
		for (int i = 0; i < height; i++) {
			for (int j = 0; j < width; j++) {
				histogram[intensity[i][j]]++;
			}
		}
		int lowCut = 0;
		int sum = 0;
		while (sum < paramValue / 100 * height * width) {
			sum += histogram[lowCut];
			lowCut++;
		}
		int highCut = 255;
		sum = 0;
		while (sum < paramValue / 100 * height * width) {
			sum += histogram[highCut];
			highCut--;
		}

		for (int i = 0; i < histogram.length; i++) {
			int k = i;
			if (k < lowCut) k = lowCut;
			else if (k > highCut) k = highCut;
			histogram[i] = 255 * (k - lowCut) / (highCut - lowCut);
		}

		Color[][] outPixels = new Color[height][width];
		for (int i = 0; i < height; i++) {
			for (int j = 0; j < width; j++) {
				Color pixel = inPixels[i][j];
				outPixels[i][j] = new Color(histogram[pixel.getRed()],
						histogram[pixel.getGreen()], histogram[pixel.getBlue()]);
			}
		}
		return outPixels;
	}
}
