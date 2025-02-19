// interface syntax
/*
	interface interfaceName 
	{
		//has part
		// does part;
		

	}


*/





interface ISample
{
	public abstract void methodOne();//
}



class TestISample implements ISample 
{
	@Override
	public void methodOne()
	{
		System.out.println("MethodOne");
	}
}


class IDemo
{
	public static void main(String[] args) 
	{
			TestISample obj = new TestISample();
			obj.methodOne();
	}
}
