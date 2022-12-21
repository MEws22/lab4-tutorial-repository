package HammerFactory;

import java.util.ArrayList;
import java.util.List;

public class HammerHandle {

	private double length = 0.0;
	private double radius = 0.0;
	
	private List<String> markers;
	
	public HammerHandle() {
		markers = new ArrayList<>();
		markers.add("Head Connection Point");
	}
			
	public double getLength() {
		return length;
	}
	
	public List<String> getMarkers() {
		return markers;
	}

	@Override
	public String toString() {
		return "HammerHandle(WOOD)";
	}
}
