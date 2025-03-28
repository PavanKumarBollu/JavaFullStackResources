class DisplayNumChar
{
	public synchronized static void displayNum()
	{
		for (int i = 0; i < 5 ; i++ )
		{
			System.out.println(i);
			try
			{
				Thread.sleep(2000);
			}
			catch (InterruptedException ie)
			{
				ie.printStackTrace();
			}
		}
	}
	public synchronized static void displayChar()
	{
		for (int i = 65; i <= 75 ; i++ )
		{
			System.out.println((char)i);
			try
			{
				Thread.sleep(2000);
			}
			catch (InterruptedException ie)
			{
				ie.printStackTrace();
			}
		}
	}
}


class MyThread1 extends Thread
{
	DisplayNumChar dnc;

	public MyThread1(DisplayNumChar dnc)
	{
		this.dnc = dnc;

	}

	@Override
	public void run()
	{
		dnc.displayNum();//calling the DisplayNumChar Class dispalyNum method
	}

}
class MyThread2 extends Thread
{
	DisplayNumChar dnc;

	public MyThread2(DisplayNumChar dnc)
	{
		this.dnc = dnc;

	}
	
	@Override
	public void run()
	{
		dnc.displayChar();
	}


}

class ClassLevelLock
{
	public static void main(String[] args) 
	{

		DisplayNumChar dnc = new DisplayNumChar();
		MyThread1 t1 = new MyThread1(dnc);
		MyThread2 t2 = new MyThread2(dnc);
		t1.start();
		t2.start();


		System.out.println("Hello World!");
	}
}
