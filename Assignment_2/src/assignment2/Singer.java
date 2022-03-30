/**Code by Jacob O'Neil, #20221893   -   Queen's University, 
 * ELEC 279: Assignment 2
 */

package assignment2;

public class Singer extends Person{
	private String debutAlbum;
	private Date ReleaseDate;

	
	//Copy Constructor
	public Singer(Singer singer) {
		super(singer);
		this.debutAlbum = singer.debutAlbum;
		this.ReleaseDate = singer.ReleaseDate;
	}
	
	public Singer(String name, Date birthDate, String gender , String debutAlbum, Date ReleaseDate, double difficulty) {
		super(name, birthDate, gender,  difficulty);
		this.debutAlbum = debutAlbum;
		this.ReleaseDate = ReleaseDate;
	}
	
	
	public Singer clone() { //Singer clone method
		return new Singer (this);
	}
	
	public String toString() { // Print all the entity details
		return super.toString() + "\nDebut Album: " + debutAlbum + "\nRelease Date: " + ReleaseDate;
	}
	
	public String entityType() {// return the type of entity
	return " This entiry is a singer!";
	}

}
