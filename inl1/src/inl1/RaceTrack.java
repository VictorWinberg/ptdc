package inl1;

import se.lth.cs.window.SimpleWindow;

public class RaceTrack {

	private int yStart, yFinish;
	
	/** Skapar en kapplöpningsbana.
	 * @param yStart startlinje
	 * @param yFinish mållinje */
	public RaceTrack(int yStart, int yFinish) {
		this.yStart = yStart;
		this.yFinish = yFinish;
	}
	
	/** Ritar kapplöpningsbanan i fönstret w */
	public void draw(SimpleWindow w) {
		int le = (int) (w.getWidth() * 0.025);
		w.setLineWidth(3);
		w.setLineColor(java.awt.Color.RED);
		w.moveTo(le * 2, yFinish);
		w.lineTo(w.getWidth() - le * 3, yFinish);
		w.setLineColor(java.awt.Color.BLACK);
		w.moveTo(le * 2, yStart);
		w.lineTo(w.getWidth() - le * 3, yStart);
		w.setLineWidth(1);
	}
	
	/** Retunerar yFinish */
	int getFinish () {
		return yFinish;
	}
}
