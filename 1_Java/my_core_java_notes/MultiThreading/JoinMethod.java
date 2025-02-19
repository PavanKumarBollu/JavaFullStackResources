class VenueFixing extends Thread
{
	static Thread vft;
	@Override
	public void run() 
	{
		vft = Thread.currentThread();
		try
		{
			System.out.println("Booking the Venue....?");
			Thread.currentThread().sleep(2000);
			System.out.println("Booking is Completed...!");
			System.out.println();
		}
		catch (InterruptedException e)
		{
		}
		
	}
} 
class CardsPrinting extends Thread
{
	static Thread cpt ;

	@Override
	public void run() 
	{
		cpt = Thread.currentThread();
		try
		{
			VenueFixing.vft.join();

			//System.out.println(VenueFixing.vft);
			System.out.println("printing the cards...!");
			Thread.currentThread().sleep(2000);
			System.out.println("cards printing is completed...!");
			System.out.println();
		}
		catch (InterruptedException e)
		{
		}
		
	}
}

class CardsDistribution extends Thread
{
	static Thread cdt;
	@Override
	public void run() 
	{
		try
		{
			cdt = Thread.currentThread();

			CardsPrinting.cpt.join();//calling the join method 

			System.out.println("Starting the cardsDistribution...");
			Thread.currentThread().sleep(2000);
			System.out.println("Completed the cardDistribution...");
			System.out.println();
		}
		catch (InterruptedException e)
		{

		}
		
	}
}

class JoinMethod
{
	public static void main(String[] args) 
	{
		VenueFixing vf		= new VenueFixing();
			vf.start();
		CardsPrinting cp	= new CardsPrinting();
			cp.start();
		CardsDistribution cd= new CardsDistribution();
			cd.start();

	}
}
