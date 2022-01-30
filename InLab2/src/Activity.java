
public class Activity {
	
	private int day; // Attributes
	private int month;
	private int year;
	
	private static int checkDate(int dayIn, int monthIn, int yearIn)
	{

		
		if(dayIn <= 0 || dayIn >=32){
		return 1;
	}
		
		else if (monthIn<= 0 || monthIn >= 13){
			return 2;
		}
		
		else if (yearIn <= 0 || yearIn >= 3000){
			return 3;
		}
		
		else{
			return 0;
		}
	}
	
	public Activity() //constructor 
	{
		day = 1;
		month = 1;
		year = 1;
	}
	
	public Activity(int dayIn, int monthIn, int yearIn)
	{
		if(checkDate(dayIn,  monthIn,  yearIn) == 0) //may need to change
		{
			day = dayIn;
			month = monthIn;
			year = yearIn;
		}
		
		else if(checkDate(dayIn,  monthIn,  yearIn) == 1) //may need to change
		{
			day = 1;
			month = monthIn;
			year = yearIn;
		}
		
		else if(checkDate(dayIn,  monthIn,  yearIn) == 2) //may need to change
		{
			day = dayIn;
			month = 1;
			year = yearIn;
		}
		
		else if(checkDate(dayIn,  monthIn,  yearIn) == 3) //may need to change
		{
			day = dayIn;
			month = monthIn;
			year = 1;
		}
		
		else 
		{
			System.out.println("Error! Date entered is not correct\n");
		}
	}
	
	public int getDay()
	{
		return day;
	}
	
	public int getMonth()
	{
		return month;
	}
	
	public int getYear()
	{
		return year;
	}
	
	
	public void setDate(int dayIn, int monthIn, int yearIn)
	{
		if(checkDate(dayIn,  monthIn,  yearIn) == 0) //may need to change
		{
			day = dayIn;
			month = monthIn;
			year = yearIn;
		}
		
		else 
		{
			System.out.println("Error! Date entered is not correct\n");
		}
	}
	
	public void printDate()
	{
		System.out.printf("%d.%d.%d\n\n", day, month, year);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//			Activity obj = new Activity();
//					obj.printDate();
		
		
	}

}
