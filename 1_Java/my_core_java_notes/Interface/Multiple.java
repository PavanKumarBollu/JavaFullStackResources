interface Left
{

// by defaultly the members of the interface will be public static final.
// by defaultly the methods of the interface will be public abstract.

	String name = "Rohit";// --> public static final String name = "Rohit";
	public void dis();
	void dis1();
	 
}
interface Right
{
	String name = "Sharma"; // --> public static final String name = "Sharma";
	public void dis(String name);
	//public void dis(String name, int num);
	void dis2();
	
}


class Test1 implements Left, Right
{
	static String rollNo = "12A";
	
	// multiple inhertance is not possible in inheritance but we can archive multiple inhertance with interfaces.
	
	//When you have multiple interface with same method signature then one implemention for that method is enough.
	// when you have same method in multiple interface with dirrent return type it not possible to implement the both interfaces at a time.
	// when you have the same method in multiple interfaces but differs in parameters then our code will run succussfully.
	//when you overload the methods it is abosoltly fine we can do that.

	@Override
	public void dis()
	{
		//System.out.println(name);// this will create a ambigous problem to the compiler to choose.
		System.out.println(Left.name);
		System.out.println(Right.name);
	}

	@Override
	public void dis(String name)
	{
		System.out.println("Right Interface");
	}

	

	@Override
	public void dis1()
	{


	}

	@Override
	public void dis2()
	{


	}

	
}


class Multiple
{
	public static void main(String[] args) 
	{
		Test1 obj = new Test1();
		obj.dis();
		obj.dis("Pavan");
		System.out.println(Test1.rollNo);
	}
}

// polymorphism will always speaks about the code flixibility which is nothing but the method overloading and method overriding.
