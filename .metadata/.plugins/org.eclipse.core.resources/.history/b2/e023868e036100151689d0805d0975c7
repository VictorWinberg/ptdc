package extra;

import java.awt.Color;
import java.util.Calendar;
import java.util.GregorianCalendar;

import se.lth.cs.window.SimpleWindow;

public class Clock {

	public static void main(String[] args) {
		Calendar cal = new GregorianCalendar();
		SimpleWindow w = new SimpleWindow(600, 600, "Clock");
		int radius;
		int hours = cal.get(Calendar.HOUR);
		int minutes = cal.get(Calendar.MINUTE);
		int seconds = cal.get(Calendar.SECOND);
		while(true) {
			for(int i = 0; i < 3; i++) {
				w.moveTo(w.getWidth() / 2, w.getWidth() / 2);
				int time;
				if(i == 0) 		{ time = hours * 30; w.setLineColor(Color.BLACK); w.setLineWidth(2); radius = w.getWidth() / 2 - 120; }
				else if(i == 1) { time = minutes * 6; w.setLineColor(Color.BLUE); w.setLineWidth(2); radius = w.getWidth() / 2 - 20; }
				else 			{ time = seconds * 6; w.setLineColor(Color.GREEN.darker()); w.setLineWidth(1); radius = w.getWidth() / 2 - 20; }
				double rad = Math.toRadians(time - 90);
				int dx = (int) (Math.cos(rad) * radius);
				int dy = (int) (Math.sin(rad) * radius);
				w.lineTo(w.getX() + dx, w.getY() + dy);
			}
			SimpleWindow.delay(1000);
			w.clear();
			if(hours == 23 && minutes == 59 && seconds == 59) hours = 0;
			else if(minutes == 59 && seconds == 59) hours++;
			if(minutes == 59 && seconds == 59) minutes = 0;
			else if (seconds == 59) minutes++;
			if(seconds == 59) seconds = 0;
			else seconds++;
		}
	}
}