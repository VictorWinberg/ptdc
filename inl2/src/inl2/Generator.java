package inl2;

import java.awt.Color;
import se.lth.cs.ptdc.fractal.MandelbrotGUI;

public class Generator {

	/** Ritar en bild i f쉗stret i anv채ndargr채nssnittet gui */
	public void render(MandelbrotGUI gui) {
		gui.disableInput();
		int pixelSize = 1;
		switch(gui.getResolution()) {
		case MandelbrotGUI.RESOLUTION_VERY_LOW: pixelSize = 9; break;
		case MandelbrotGUI.RESOLUTION_LOW: pixelSize = 7; break;
		case MandelbrotGUI.RESOLUTION_MEDIUM: pixelSize = 5; break;
		case MandelbrotGUI.RESOLUTION_HIGH: pixelSize = 3; break;
		case MandelbrotGUI.RESOLUTION_VERY_HIGH: pixelSize = 1; break;
		}
		boolean BW = gui.getMode() == MandelbrotGUI.MODE_BW;
		int width = gui.getWidth() / pixelSize;
		int height = gui.getHeight() / pixelSize;
		int extra = 200;
		if (gui.getExtraText().matches("[0-9]+"))
			extra = Integer.parseInt(gui.getExtraText());

		Complex[][] complex = mesh(gui.getMinimumReal(), gui.getMaximumReal(), 
				   gui.getMinimumImag(), gui.getMaximumImag(), width, height);

		Color[][] image = new Color[height][width];
		Color[] colors = new Color[extra + 1];
		for(int i = 0; i <= extra; i++) {
			colors[i] = new Color(i);
		}
		for (int im = 0; im < height; im++) {
			for (int re = 0; re < width; re++) {
				Complex z = new Complex(0, 0);
				Complex c = complex[im][re];
				int k = 0;
				while (z.getAbs2() <= 4 && k < extra) {
					z.mul(z);
					z.add(c);
					k++;
				}
				if (z.getAbs2() <= 4) 	image[im][re] = Color.BLACK;
				else if(BW == true)		image[im][re] = Color.WHITE;
				else					image[im][re] = colors[k];
			}
		}
		gui.putData(image, pixelSize, pixelSize);
		gui.enableInput();
	}

	/** Skapar en matris d채r varje element 채r ett komplext tal som har r채tt
	 * koordinater (se beskrivning nedan) */
	private Complex[][] mesh(double minRe, double maxRe, double minIm,
			double maxIm, int width, int height) {
		Complex[][] mesh = new Complex[height][width];
		for (int im = 0; im < height; im++) {
			for (int re = 0; re < width; re++) {
				mesh[im][re] = new Complex(
						minRe + re * (maxRe - minRe) / width, 
						maxIm - im * (maxIm - minIm) / height);
			}
		}
		return mesh;
	}
}