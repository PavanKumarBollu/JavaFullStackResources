
// Method overloading with Numeric type promotion
class Calculator4
{
	
	float add(float a, int b)
	{
		return a+b;
	}
	
	float add(float a, float b, int c)
	{
		return a+b+c;
	}
	float add(float ...num)
	{
		float sum = 0;
		for(float f : num)
		{
			sum+=f;
		}
		return sum;
	}
}
public class LaunchMOSC2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calculator4 cal=new Calculator4();
		System.out.println(cal.add(10, 20,40,50,60,70));

	}

}
