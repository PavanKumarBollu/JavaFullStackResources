import java.util.*;

class StudentEnc
{
	private String name = " ";
	private int rollNo = 0;
	//Constructors 
	public StudentEnc(String name, int rollNo)
	{
		this.name = name;
		this.rollNo = rollNo;
	}


	public String getName()
	{
		return name;
	}

	public int getRollNo()
	{
		return rollNo;
	}

	// Setters

	public void setName(String name)
	{
		this.name = name;
	}
	public void setRollNo(int rollNo)
	{
		this.rollNo = rollNo;
	}
}


class Enc1
{
	public static void main(String[] args) 
	{
		//Scanner s = new Scanner(System.in);
		//System.out.println("Enter The Student name: ");
		//String name = s.next();
		//System.out.println("Enter the RollNo :");
		//int rollNo = s.nextInt();

		String name = "Rohit";
		int rollNo = 45;

		StudentEnc std1 = new StudentEnc(name, rollNo);

		System.out.println("Before Changing the name "+std1.getName());
		std1.setName("Praveen");
	

		System.out.println("After Changing the name " +std1.getName());

		System.out.println("Before Changing the rollNo "+std1.getRollNo());
		std1.setRollNo(91);
	

		System.out.println("After Changing the rollNo " +std1.getRollNo());


	}
}
