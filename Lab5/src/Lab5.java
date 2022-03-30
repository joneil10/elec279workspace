import java.util.ArrayList;
import java.util.Random;


public class Lab5 {
	
	public static void main(String[] args){
	int listSize = 5;
	ArrayList<Integer> intArray = new ArrayList<Integer>(listSize);
	
	Random rand  = new Random();
	intArray.ensureCapacity(10);
	
	for(int i = 0; i < 10; i++) {
		int randInt = rand.nextInt(100);
		intArray.add(randInt);
		}
	
	//Reverse sequence
	
	ArrayList<Integer> revIntArray = new ArrayList<Integer>(10);
	revIntArray.ensureCapacity(10);
	
	   intArray.forEach((num) -> { //for(revIntArray : 10...)
           revIntArray.add(0, num);
       });
	   
	   System.out.println(revIntArray.toString());
	   
	   
	   ArrayList<HourlyEmployee> listOfHoulryEmployees = new ArrayList<HourlyEmployee>(100);
	   
	   HourlyEmployee H1 = new HourlyEmployee();
	   HourlyEmployee H2 = new HourlyEmployee();
	   HourlyEmployee H3 = new HourlyEmployee();
	   HourlyEmployee H4 = new HourlyEmployee();
	   
//	   H2.setRate(3.0);
//	   h3.
	   
	   listOfHoulryEmployees.add(H1);
	   listOfHoulryEmployees.add(H2);
	   listOfHoulryEmployees.add(H3);
	   listOfHoulryEmployees.add(H4);
	   
	   System.out.print(listOfHoulryEmployees.toString()); //print out array 
	   
	   System.out.print(listOfHoulryEmployees.size()); //Print size of array
	   
	   HourlyEmployee H5 = new HourlyEmployee();
	   listOfHoulryEmployees.add(H5);
	
	   System.out.print(listOfHoulryEmployees.toString()); //print out array 
	   
	   listOfHoulryEmployees.remove(2);                                        // removing the third element
       //System.out.println(listOfHourlyEmployees.toString());                   // H2 should be removed 

	   listOfHoulryEmployees.trimToSize();          // making capacity = size
	   
	   
	   
	   
	}
}

