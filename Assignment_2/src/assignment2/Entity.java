/**Code edited by Jacob O'Neil, #20221893   -   Queen's University, 
 * ELEC 279: Assignment 2
 */

package assignment2;

public abstract  class Entity {
	private String name;
	private Date born;
	private double difficulty;
	
	public Entity(String name, Date birthDate, double difficulty ) {
		this.name = name;
		this.born = new Date(birthDate); //no privacy leak
		this.difficulty = difficulty;
	}
	
	
	public Entity(Entity entity) {
		this.name = entity.name;
		this.born = new Date(entity.born); //no privacy leak
		this.difficulty = entity.difficulty;
	}

	public String getName() {
		return name;
	}

	public Date getBorn() {
		return new Date(born);
	}
	
	//-
	public double getDifficulty() {
		return difficulty;
	}
	
	public String toString() {
		return "\nName: "+name+"\n"+"Born at: "+born.toString(); 
		
	}
	
	public int getAwardTicketNumber() 
	{
		return (int)((this.difficulty) * 100.0); // Calculate and return the amount of tickets the user won from guessing the correct date 
	}
	
	public String welcomeMessage() //welcomeMessage method that prints out the welcome message and tells the user the type of Entity they will be guessing (i.e. Country)
	{
		return "Welcome! Let’s start the game!" + entityType()+ "\n"; 
	}

	
	public String closingMessage() //closingMessage method that prints out the closing message which congratulates the user on their correct guess, and displays all the information of the entity
	{
		return "Congratudations! The detailed information of the entity you guessed is:" + toString();
	}
	
	 abstract String entityType(); //abstract entityType method 
	
	
	 public abstract Entity clone(); //abstract clone method 
	
	

	
	
	
} //End 
