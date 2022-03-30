/**Code edited by Jacob O'Neil, #20221893   -   Queen's University, 
 * ELEC 279: Assignment 2
 */

package assignment2;

import java.util.Random;
import java.util.Scanner;

public class GuessMaster {
	private int numOfEntities;
	private Entity[] entities; 
	private int numOfTickets;
	
	public GuessMaster() {
		numOfEntities = 0;
		entities = new Entity[100]; 
		numOfTickets = 0;
	}

	public void addEntity(Entity entity) {
		entities[numOfEntities++] = (Entity)entity.clone(); //invoke clone method 
	}
	
	public void playGame(int entityId) {
		Entity entity = entities[entityId];
		playGame(entity);
	}
	
	public void playGame(Entity entity) {
		System.out.println("***********************************");
		System.out.println(entity.welcomeMessage()); //Print welcome message

		
		
		System.out.printf("Guess %s's birthday\n", entity.getName());
		System.out.println("(mm/dd/yyyy)");
		
		Scanner scanner = new Scanner(System.in);

		while (true) {
			String answer = scanner.nextLine();
			answer = answer.replace("\n", "").replace("\r", "");

			if (answer.equals("quit")) {
				System.exit(0);
			}

			Date date = new Date(answer);

			if (date.precedes(entity.getBorn())) {
				System.out.println("Incorrect. Try a later date.");
			} else if (entity.getBorn().precedes(date)) {
				System.out.println("Incorrect. Try an earlier date.");
			} else {
				numOfTickets = numOfTickets + entity.getAwardTicketNumber();

				System.out.println("*************Bingo!***************");
				System.out.printf("You won %d tickets in this round. \nThe total number of your tickets is %d.", entity.getAwardTicketNumber(), numOfTickets); //print number of tickets won in the current round and total tickets won throughout the game
				System.out.println("\n***********************************");
				
				System.out.println(entity.closingMessage()); //print the closing message
				break;
			}
		}
	}
	
	public void playGame() {
		while (true) {
			int entityId = genRandomEntityId();
			playGame(entityId);
		}
	}

	public int genRandomEntityId() {
		Random randomNumber = new Random();
		return randomNumber.nextInt(numOfEntities);
	}

	public static void main(String[] args) {
		System.out.println("=========================\n");
		System.out.println("     GuessMaster 2.0 \n");
		System.out.println("=========================\n");
		Politician jTrudeau = new Politician("Justin Trudeau", new Date("December", 25, 1971), "Male",  "Liberal", 0.25);
		Singer cDion = new Singer("Celine Dion", new Date("March", 30, 1961), "Female", "La voix du bon Dieu", new Date("November", 6, 1981), 0.5);
		Person myCreator = new Person("myCreator", new Date("September", 1, 2000), "Female", 1);
		Country usa = new Country("United States", new Date("July", 4, 1776), "Washinton D.C.", 0.1);

		GuessMaster gm = new GuessMaster();
		gm.addEntity(jTrudeau);
		gm.addEntity(cDion);
		gm.addEntity(myCreator);
		gm.addEntity(usa);
		
		gm.playGame();
	}
}
