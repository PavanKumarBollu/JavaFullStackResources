import java.util.Scanner;

class Exeception
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Number");
		int a = sc.nextInt();
		System.out.println("Enter second Number");
		int b = sc.nextInt();
		cal(a,b);
		//new Exeception().cal(a,b);
	}

	public static void cal(int a, int b)
	{
		int sum = a+b;
		int div = a/b;
		System.out.println("Sum of the Two  values is : " +  sum);
		System.out.println("division of two number is : " +  div);
	}
}
