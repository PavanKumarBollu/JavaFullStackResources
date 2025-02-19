interface Test
{
	public abstract void add(int i , int j);
}
interface Sub
{
	void sub(int i , int j);
}


class InterfaceExample
{
	public static void main(String... arg)
	{
		Test t = (i, j) ->{
			System.out.println("Sum of " + i + " and " + j + " is : " + (i+j) ); 
		};

		t.add(5,3);

		//subtraction 

		Sub s = (i, j)->
		{
			System.out.println("Subtraction of " + i + " and " + j + " is : " + (i-j) ); 
		};

		s.sub(20,5);

	}
}