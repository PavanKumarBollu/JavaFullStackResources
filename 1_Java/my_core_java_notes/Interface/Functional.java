@FunctionalInterface
interface IFunctional
{
	public abstract void add(int a, int b);
}
// to write lambda exp we use lambda operator (->)
// lambda operator divided into 2 parts to writw lambda exp
// left side of lambda operator we write parameters required
//right side of lambda operator we write body or implementation
// left side for parameters datatype is optional
// write side if implementation or body has one statement then {} is optional
// left side if parameter is single then () and type of data both optional
// write side in body if its single line implementaion then return statement is also optional
// {} is mandtaory if there are more then one statement and also if there is return statement explictly used by developer


class Functional 
{
	public static void main(String[] args) 
	{
		IFunctional add = (a, b) -> {
			
			System.out.println(a + b);
		};

		add.add(5,5);
	}
}
