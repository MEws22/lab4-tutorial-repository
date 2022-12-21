package HammerFactory;

import java.util.ArrayList;
import java.util.List;

public class Hammer {

	private HammerHandle hammerHandle;
	private HammerHead hammerHead;
	
	private List<String> markers;
	
	
	public Hammer() {
		hammerHandle = new HammerHandle();
		hammerHead = new HammerHead();
		markers = new ArrayList<>();
	}
	
	@Override
	public String toString() {
		return "Hammer(Hammer Handle,Hammer Head)";
	}
}

