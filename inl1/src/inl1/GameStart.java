package inl1;
import se.lth.cs.window.SimpleWindow;

public class GameStart {

	/** Visar en starttext som väntar p� spelarens musklick 
	 * @param w SimpleWindowf�nstret
	 * @param s starttexten */
	public GameStart(SimpleWindow w, String s) {
		w.moveTo(w.getWidth() / 2 - 50, w.getWidth() / 2);
		w.writeText(s);
		w.waitForEvent();
		w.setLineColor(java.awt.Color.WHITE);
		w.writeText(s);
		w.setLineColor(java.awt.Color.BLACK);
	}
}