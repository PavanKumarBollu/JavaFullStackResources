class Trim
{
	public static void main(String[] args) 
	{
		String str = " trim method will remove the white spaces begining and end of the String ";
		
		System.out.println(str.length());

		String newStr = str.trim();
		

		
		System.out.println(newStr.length());
		String finalRes = str.replace(' ', '$');

		System.out.println(finalRes);
	}
}
