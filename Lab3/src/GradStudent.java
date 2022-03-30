
public class GradStudent extends Student{
	
	private static int ATTEMPT = 6;
	
	private int comMembers;
	private int numOfExams;

	private String[] gradExamName;
	private String[] gradExamGrade;

	
	public GradStudent(String name, String address, int idNum) {
		super(name, address, idNum);
		
		this.comMembers = 0;
		this.numOfExams = 0;
		
		gradExamName = new String[ATTEMPT];
		gradExamGrade = new String[ATTEMPT];
	}
	
	public int getComitteeNum() {
		return comMembers;
	}
	
	public void setComitteeNum(int comMembers) {
		this.comMembers = comMembers;
	} 
	
	public void addGrade(String examName, String examGrade) {
		if(numOfExams <= ATTEMPT) {
			this.gradExamName[numOfExams] = examName;
			this.gradExamGrade[numOfExams] = examGrade;
			numOfExams++;
		}
	}
	
	public String toString() {
		return "Grad " + super.toString();
	}
	
	public void printExamGrades() {
		for(int i = 0; i < numOfExams; i++)
		{
			System.out.println(gradExamName[i] + ": " + gradExamGrade[i]);
		}
	}
}
