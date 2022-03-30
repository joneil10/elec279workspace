
public class Triple<T1, T2> {
	
	private T1 origin;
	private T2 distance;
	private T1 destination;
	
	public Triple() {
		this.origin = null;
		this.distance = null;
		this.destination = null;
	}//default constructor
	
	public Triple(T1 o, T2 di, T1 de) {
		this.origin = o;
		this.distance = di;
		this.destination = de;
	}
	
	public String toString() {
		return ("Departure city: " + origin.toString() + "; Distance: " + distance.toString() + "; Arrival city: " + destination.toString() + "\n");
	}
	
	public boolean equals(Object otherPair) {
		if (otherPair == null) {
			return false;
		}
		
		else if (getClass() != otherPair.getClass()) {
			return false;
		}
		
		else {
			Triple<T1, T2> otherObj = (Triple<T1, T2>)otherPair;
			return (origin.equals(otherObj.origin) && distance.equals(otherObj.distance) && destination.equals(otherObj.destination));
		}
		
		
	}
	
	
}
