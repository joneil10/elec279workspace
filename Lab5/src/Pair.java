
public class Pair <T> {
	
	private T wife;
	private T husband;
	
	public Pair () {
		this.wife = null;
		this.husband = null;
	}//default constructor
	
	public Pair (T w, T h) {
		this.wife = w;
		this.husband = h;
	}//Constructor
	
	public T getWife() {
		return this.wife;
	}
	
	public T getHusband() {
		return this.husband;
	}
	
	public String toString() {
		return ("Wife's name: " + wife.toString() + "; Husband's name: " + husband.toString() +"\n");
	}
	
	public boolean equals(Object otherPair) {
		if (otherPair == null) {
			return false;
		}
		
		else if (getClass() != otherPair.getClass()) {
			return false;
		}
		
		else {
			Pair<T> otherObj = (Pair<T>)otherPair;
			return (wife.equals(otherObj.wife) && husband.equals(otherObj.husband));
		}
		
		
	}
	
	

}
