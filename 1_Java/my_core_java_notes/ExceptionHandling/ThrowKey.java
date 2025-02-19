class ThrowKey
{
	public static void main(String[] args) throws Exception
	{
			try
			{
				dis();
			}
			catch (Exception e)
			{
			}
	}

	public static void dis() 
	{
		
		try
		{
			dis1();
		}
		catch (Exception e)
		{
			try
			{
				throw new Exception("Can't call the dis1() method");
			}
			catch (Exception se)
			{
				System.out.println(e.getMessage());
				System.out.println(se.getMessage());
			}
		}
	}

	public static void dis1() throws Exception
	{
		try
		{
			System.out.println(10/0);
		}
		catch (Exception e)
		{
			throw new Exception("Can't divide the number with zero");
		}
	}
}
