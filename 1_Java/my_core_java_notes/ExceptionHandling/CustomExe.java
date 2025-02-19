class UnderAgeException extends RuntimeException
{
	public UnderAgeException(String str){
		super(str);
	}
}

//Syntax
/*
	class className extends TypeOfException(eg:RuntimeException)
	{
		// create parameterized constructor and call the super method
		eg:
		public className(String str)
		{
			super(str);
		}
	}
*/



class CustomExe
{
	public static void main(String[] args) 
	{
		int age = 17;
		if (age < 18)
		{
			System.out.println(10/0);
			//throw new UnderAgeException("Please Wait for sometime one day you can vote..?");
		}
	}
}
