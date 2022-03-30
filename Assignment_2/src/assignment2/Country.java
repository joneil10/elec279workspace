/**Code by Jacob O'Neil, #20221893   -   Queen's University, 
 * ELEC 279: Assignment 2
 */

package assignment2;

public class Country extends Entity{
		private String capital;
		
		
		public Country(Country country) {
			super(country);
			this.capital = country.capital;
	}
		
		
		public Country(String name, Date birthDate, String capital, double difficulty) {
			super(name, birthDate, difficulty);
			this.capital = capital;
		}
	
		
		public Country clone() { //Country clone method
			return new Country (this);
		}
		
		public String toString() { // Print all the entity details
			return super.toString() + "\nCapital: " + capital;
		}
		
		public String entityType() { // return the type of entity
			return " This entity is a country!";
		}
	
}
