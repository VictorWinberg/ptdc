package mvc;

import java.util.Observable;

public class Model extends Observable {
	private boolean on = false;
	
	public void useSwitch() 	{
		on = !on;
		setChanged();
		notifyObservers();
	}
	
	public boolean isOn() 	{	return on;	}
}
