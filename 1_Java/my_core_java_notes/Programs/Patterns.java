class Patterns
{
	public static void main(String... arg)
	{
		KeyEle(10);
	}
	public static void KeyEle(int  n)
	{
		for (int i = 0; i <= n ; i++)
		{
			for (int j = 0; j <= n; j++ )
			{
				if( (i==0 && j==0) 
					|| (i == 0 && j ==5)  
					|| (i == 0 && j ==n) 
					|| (i == 5 && j ==0)
					|| (i == n && j ==0) 
					|| (i ==5 && j ==5) 
					|| (i == 5 && j ==10) 
					|| (i==10&& j == 5) 
					|| (i ==10 && j == 10) )
				{
					System.out.print("#");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println(" ");
		}
	}
}