package Assignment4;

public class collegeInfo1 {

	private int studentID;
	private String studentName;
	private String course;
	private int admissionNumber;
	
	public collegeInfo1()
	{
		
	}
	public collegeInfo1(int studentID, String studentName)
	{
		this.studentID = studentID;
		this.studentName= studentName;
	}
	public collegeInfo1(int studentID, String studentName, String course)
	{
		this.studentID = studentID;
		this.studentName = studentName;
		this.course = course;
	}
	public collegeInfo1(int studentID, int admissionNumber)
	{
		this.studentID = studentID;
		this.admissionNumber = admissionNumber;
	}
	public collegeInfo1(int i, int j, String string) {
		// TODO Auto-generated constructor stub
	}
	public static void displaycollegeInfo1(collegeInfo1 student)
	{
		System.out.println("student ID is:" + student.studentID);
		System.out.println("student name is:" + student.studentName);
		System.out.println("student cousre is:" + student.course);
		System.out.println("student admissionNumber is:" + student.admissionNumber);
		System.out.println();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		collegeInfo1 student1 = new collegeInfo1(1, "srinath");
		collegeInfo1 student2 = new collegeInfo1(2, "hari", "computer science");
		collegeInfo1 student3 = new collegeInfo1(3, "raj");
		collegeInfo1 student4 = new collegeInfo1(4,101,"english");
		
		displaycollegeInfo1(student1);
		displaycollegeInfo1(student2);
		displaycollegeInfo1(student3);
		displaycollegeInfo1(student4);

	}

}
