/**Code by Jacob O'Neil, #20221893   -   Queen's University, 
 * ELEC 279: Assignment 2
 */

package assignment2;

public class Politician extends Person{
	
	private String party;

	//Copy Constructor 
	public Politician(Politician politician) {
		super(politician);
		this.party = politician.party;
	}
	
	public Politician(String name, Date birthDate, String gender , String party, double difficulty) {
		super(name, birthDate, gender, difficulty);
		this.party = party;
	}
	

	public Politician clone() { //Politician clone method
		return new Politician(this);
	}
	
	public String toString() { // Print all the entity details
		return super.toString() + "\nParty: " + party;
	}
	
	public String entityType() {// return the type of entity
	return " This entiry is a politician!";
	}

}
