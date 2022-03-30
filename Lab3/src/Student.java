
public class Student extends Person{

	 private static int MAXCOURSES = 20;
	 
	 private int numOfCourses; 
	 private String[] courseCode;
	 private int[] grade;
	 
	 
	 public Student(String name, String address, int idNum) {
		super(name, address, idNum);
		
		this.numOfCourses = 0;
		courseCode = new String[MAXCOURSES];
		grade = new int[MAXCOURSES];
	}
	 
	 public String toString() {
		 return "Student: " + super.toString();
	 }
	 
	 public void addGrade(String cCode, int cGrade) {
		if(numOfCourses <= MAXCOURSES) {
			 this.courseCode[numOfCourses] = cCode;
			 this.grade[numOfCourses] = cGrade;
			 numOfCourses++;
		}
	 }
	 
	 public void printGrades() {
		 for(int i = 0; i < numOfCourses; i++)
			{
				System.out.println(courseCode[i] + ": " + grade[i]);
			}

	 }
	 
	



}
