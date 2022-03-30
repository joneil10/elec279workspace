/**Code by Jacob O'Neil, #20221893   -   Queen's University, 
 * ELEC 279: Assignment 2
 */

package assignment2;

public class Person extends Entity{
	
	private String gender;
	
	
	//Copy Constructor
	public Person(Person person) {
		super(person);
		this.gender = person.gender;
	}
	
	public Person(String name, Date birthDate, String gender, double difficulty) {
		super( name, birthDate,  difficulty);
		this.gender = gender;
}

	public Person clone() { //Person clone method
		return new Person (this);
	}
	
	
	public String toString() { // Print all the entity details
		 return super.toString() + "\nGender: " + gender;
	}
	
	public String getGender() {
		return gender;
	}

	public String entityType() {// return the type of entity
		return " This entiry is a " + this.gender +"!";
	}

}
