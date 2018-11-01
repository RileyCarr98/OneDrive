package Student;

public class Identification extends StudentMain{
	private int idNum;
	private String studentName;
	
	public void setIdNum (int id)
	{
		id = idNum;
	}
	public int getIdNum (int id)
	{
		return id;
	}
	public void setStudentName(String stuName)
	{
		stuName = studentName;
	}
	public String getStudentName(String stuName)
	{
		return studentName;
	}
	
	public Identification(String studentName, int idNum)
	{
		this.studentName = studentName;
		this.idNum = idNum;
		System.out.println("Student Name: " + studentName);
		System.out.println("Student id Number: " + idNum);
		
	}
}
