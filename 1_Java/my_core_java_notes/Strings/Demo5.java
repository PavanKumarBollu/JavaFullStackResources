class Demo5
{
	public static void main(String[] args) 
	{
		//String name = "SachinTendulkar";	//-->sachintendulkar
		//String name1 = "sachintendulkar";	//-->sachintendulkar

			//int place = name.lastIndexOf('a');//13
			//System.out.println(place);//13
			//System.out.println(name.charAt(place));//a

			//A -> a --> toLowerCase();
			//a -> A -->toUpperCase();

			//System.out.println(name.equals(name1));//False//Passwords
			//System.out.println(name.equalsIgnoreCase(name1));//True//Emails



		//String nameUpper = "ROHIT";

		//String nameLower = "";

		//for(int i = 0; i < nameUpper.length(); i++)
		//{
		//	nameLower += (char)((nameUpper.charAt(i)) + 32);
			
		//}

		//System.out.println(nameUpper);//
		//System.out.println(nameLower);//

		// A + 32 => 97 -> a 


		String nameUpper = "RoHiT";

		String nameLower = "";

		for(int i = 0; i < nameUpper.length(); i++)
		{
			//toUpperCase
			if(nameUpper.charAt(i) >= 'a' && nameUpper.charAt(i) <= 'z')//65 >= A =< 91 --> (a) 97
			{
				nameLower += (char)((nameUpper.charAt(i)) - 32);
			}
			//toLowerCase
			else if(nameUpper.charAt(i) >= 'A' && nameUpper.charAt(i) <= 'Z')//65 >= A =< 91 --> (a) 97
			{
				nameLower += (char)((nameUpper.charAt(i)) + 32);
			}
			else
			{
				nameLower += nameUpper.charAt(i);
			}


			
			
		}

		System.out.println(nameUpper);//
		System.out.println(nameLower);//


		




	}
}
