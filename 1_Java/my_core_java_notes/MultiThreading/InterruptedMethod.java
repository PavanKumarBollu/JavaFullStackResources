class Interrupt extends Thread
{
	@Override
	public void run()
	{
		for (int i=0; i<100 ; i++ )
		{
				System.out.println("i am lazy let me sleep " + i);
		}

		try
		{
			System.out.println(" i am going to sleep ");

			Thread.sleep(2000);
		}
		catch (InterruptedException i)
		{
			i.printStackTrace();
		}
		System.out.println("Thank for making me sleep, i am ready now");
	}
}


class InterruptedMethod
{
	public static void main(String[] args) 
	{
		Interrupt i = new Interrupt();
			i.start();

			//i.interrupt();

			System.out.println("End Of the main method");
	}
}
