
public class Stock {
	
	private int day; // Attributes
	private int month;
	private int year;
	private String name;
	private int[] values = new int[7];
	
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
	
	private static int checkArray(int[] valIn)
	{
		if(valIn.length != 7)
		{
			return 0;
		}
		
		else 
		{
			for(int i = 0; i < 7; i++)
			{
				if(valIn[i]<0)
				{
					return 0;
				}
				else
				{
					continue;
				}
			}
			return 1;
		}
	}
	
	public Stock()
	{
		day = 1;
		month = 1;
		year = 1;
		name = "";
		values = new int[] {0,0,0,0,0,0,0};
	}
	
	public Stock(int dayIn, int monthIn, int yearIn, String nameIn, int[] valIn)
	{
		name = nameIn;
		
		if (checkArray(valIn) == 1)
		{
			values = java.util.Arrays.copyOf(valIn, 7);
		}
		
		if(checkDate(dayIn,  monthIn,  yearIn) == 0) //may need to change
		{
			day = dayIn;
			month = monthIn;
			year = yearIn;
			
		}
		
		if(checkDate(dayIn,  monthIn,  yearIn) == 0) //may need to change
		{
			day = dayIn;
			month = monthIn;
			year = yearIn;
		
		}
		
		else if(checkDate(dayIn,  monthIn,  yearIn) == 1 ) //may need to change
		{
			day = 1;
			month = monthIn;
			year = yearIn;
			
		}
		
		else if(checkDate(dayIn,  monthIn,  yearIn) == 2 ) //may need to change
		{
			day = dayIn;
			month = 1;
			year = yearIn;
			
		}
		
		else if(checkDate(dayIn,  monthIn,  yearIn) == 3 ) //may need to change
		{
			day = dayIn;
			month = monthIn;
			year = 1;
			
		}
				
		else
		{
			System.out.println("Error! Data entered is invalid\n");
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
	
	public String getName()
	{
		return name;
	}
	
	public int getValue(int ind)
	{
		if (ind >= 7)
		{
			System.out.println("Error! Index out of bounds\n");
			return -1;
		}
		
		else
		{
			return values[ind];
		}
		
	}
	
	
	
//	public void setDate(int dayIn, int monthIn, int yearIn)
//	{
//		if(checkDate(dayIn,  monthIn,  yearIn) != 0) //may need to change
//		{
//			day = dayIn;
//			month = monthIn;
//			year = yearIn;
//		}
//		
//		else 
//		{
//			System.out.println("Error! Date entered is not correct\n");
//		}
//	}
	
	public void setName(String nameIn)
	{
		name = nameIn;
	}
	
	public void setValue(int val, int ind)
	{
		if(val < 0 || ind > 7)
		{
			System.out.println("Error! Invalid value or index\n");
		}
		
		else 
		{
			values[ind] = val;
		}
		
	}
	
	public void printStock()
	{
		System.out.printf("%s: %d.%d.%d values:\n%d, %d, %d, %d, %d, %d, %d\n", name, day, month, year,values[0],values[1],values[2],values[3],values[4],values[5],values[6]);
		//System.out.printf("%d.%d.%d.%s.%d\n", day, month, year, name, values[0]);
	}
	
	public int getMean()
	{
		int sum = 0;
		for(int i = 0; i < 7; i++)
		{
			sum+=values[i];
		}
		
		return (sum/7);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
