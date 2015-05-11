package lab8_9;
import se.lth.cs.ptdc.images.ImageFilter;
import se.lth.cs.ptdc.images.ImageGUI;

public class ImageProcessor {
	public static void main(String[] args) {
		ImageFilter[] filters = new ImageFilter[10];
		filters[0] = new IdentityFilter("Identity Filter");
		filters[1] = new BlueFilter("Blue Filter");
		filters[2] = new InvertFilter("Invert Filter");
		filters[3] = new GrayScaleFilter("Gray Scale Filter");
		filters[4] = new ColorFilter("Color Filter");
		filters[5] = new BlackAndWhiteFilter("BW Filter");
		filters[6] = new ShatterFilter("Shatter Filter");
		filters[7] = new SwitchColor("Switch Filter");
		filters[8] = new ContrastFilter("Contrast Filter");
		filters[9] = new GaussFilter("Gauss Filter");
		new ImageGUI(filters);
	}
}