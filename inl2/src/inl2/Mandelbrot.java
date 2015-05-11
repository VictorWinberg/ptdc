package inl2;

import se.lth.cs.ptdc.fractal.MandelbrotGUI;

public class Mandelbrot {

	public static void main(String[] args) {
		MandelbrotGUI gui = new MandelbrotGUI();
		Generator g = new Generator();
		boolean reset = true;
		while (true) {
			switch (gui.getCommand()) {
			case MandelbrotGUI.ZOOM: if(reset) break;
			case MandelbrotGUI.RENDER: g.render(gui); reset = false; break;
			case MandelbrotGUI.RESET: gui.resetPlane(); 
			     gui.clearPlane(); reset = true; break;
			case MandelbrotGUI.QUIT: System.exit(1); break;
			}
		}
	}
}