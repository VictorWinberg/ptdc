package mvc;

import java.util.Observable;
import java.util.Observer;

import javax.swing.JButton;

public class View extends JButton implements Observer{
	private Model model;
	
	public View(Model model) {
		super(model.isOn() ? "ON" : "OFF");
		this.model = model;
		model.addObserver(this);
	}
	
	@Override
	public void update(Observable obs, Object obj) {
		setLabel(model.isOn() ? "ON" : "OFF");
	}
}
