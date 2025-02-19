class Animal
{
	private String name = "animal";



	//Getters and Setters

	public String getName()
	{
		return name;
	}

}

class Test
{
	
	public String getAni()
	{
		Animal ani1 = new Animal();
		return ani1.getName();
	}
}

class Encapsulation
{
	public static void main(String[] args) 
	{
		//Animal ani = new Animal();

		Test en = new Test();
		System.out.println(en.getAni());//
	}
	
}
