class SubString
{
	public static void main(String[] args) 
	{
		String str = "SubString will return the part of this string";

		//System.out.println(str);
		//System.out.println(str.length());

		String subStr = str.substring(3);
		//System.out.println(subStr);
		//System.out.println(subStr.length());


		//String fullName = "Rohit Sharma";
		//String firstName = fullName.substring(0, 5);
		//String lastName = fullName.substring(6);
		//System.out.println(fullName);
		//System.out.println(firstName);
		//System.out.println(lastName);

		String firstName = "Sharma";
		String lastName = "Rohit";
		//String fullName = firstName + " "  + lastName;
		//System.out.println(fullName);



		//String firstName = "Pavan";
		//String lastName = "Kumar";

		//autoemails
		System.out.println(firstName + lastName.charAt(0) + "." + "@gamil.com");
	}
}
