package mvc;

import javax.swing.JButton;
import javax.swing.JFrame;

public class App {

	public static void main(String[] args) {
		Model model = new Model();
		View view = new View(model);
		Control control = new Control(model, view);
		JFrame f = new JFrame();
		f.add(view);
		f.setVisible(true);
		f.setSize(100, 100);
		while(true) {
			System.out.println("1");
		}
	}

}
