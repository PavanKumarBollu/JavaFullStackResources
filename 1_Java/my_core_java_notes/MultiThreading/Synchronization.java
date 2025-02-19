class Display
{
	public synchronized void wish(String name){
		for (int i = 0; i < 5 ; i++ )
		{
			System.out.print("Good Morning: ");
			try
			{
				Thread.sleep(2000);
			}
			catch (InterruptedException ie)
			{

			}
			System.out.println(name);
		}
	}
}
class MyThread extends Thread
{
	Display d;
	String name;

	public MyThread(Display d, String name)
	{
		this.d = d;
		this.name = name;
	}

	@Override
	public void run()
	{
		d.wish(name);
	}	
}

class Synchronization
{
	public static void main(String[] args) 
	{
		Display d =	new Display();
		MyThread t1 = new MyThread(d,"Rohit");
		MyThread t2 = new MyThread(d, "Sky");
		t1.start();
		t2.start();



		//System.out.println("End of the main method");
	}
}
