package HammerFactory;

import java.util.ArrayList;
import java.util.List;

public class HammerHead {

	private double length = 0.0;
	private double width = 0.0;
	private double height = 0.0;
	
	private List<String> markers;
	
	public HammerHead() {
		markers = new ArrayList<>();
		markers.add("Handle Connection Point");
	}
			
	public double getLength() {
		return length;
	}
	
	public List<String> getMarkers() {
		return markers;
	}

	@Override
	public String toString() {
		return "HammerHead(STEEL)";
	}
}
