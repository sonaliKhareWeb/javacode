public class ArgumentsExample
{
	public static void main(String args[])
	{
		
		System.out.println("This is  1st value from user "+args[0]);
		System.out.println("This is 2nd value from user :"+args[1]);
		
		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
		
		
		int c=a+b;
		System.out.println("Addition of :"+c);
		
		int d=a-b;
		System.out.println("Substraction of :"+d);
		
		int e=a*b;
		System.out.println("Multiplication of :"+e);
		
		int f=a/b;
		System.out.println("Divisition of :"+f);
	}
}




