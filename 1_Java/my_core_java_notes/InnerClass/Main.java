
class OuterClass
{
	public void outerDis()
	{
		System.out.println("Outer Class Display method");
	}

	class InnerClass 
	{
		public void innerDis()
		{
			System.out.println("Inner class display Methods"); 
		}
	}

	static class StaticInnerClass
	{

		public void innerDis()
		{
			System.out.println("Static Inner class display Methods"); 
		}
	}
}

class Main
{
	public static void main(String[] args) 
	{
		//creating the OuterClass Object

		OuterClass outerClass = new OuterClass();


		// Accessing the OuterClass Methods
		outerClass.outerDis();
	

		// Creating the InnerClass Object
		
		
		OuterClass.InnerClass innerClass = new OuterClass().new InnerClass();
		//Accessing InnerClass Methods
		innerClass.innerDis();




		//Creating the Static InnerClass Object

		OuterClass.StaticInnerClass sic = new OuterClass.StaticInnerClass();

		//StaticInnerClass Methods
		sic.innerDis();
		






	}
}
