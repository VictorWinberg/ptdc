package mvc;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Control implements ActionListener{
	private Model model;
	
	public Control(Model model, View view) {
		view.addActionListener(this);
		this.model = model;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		model.useSwitch();
	}
}
