import java.util.*;
public class ArithmeticOperator
{
	public static void main(String args[])
	{	int i,s,c;
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the first value");
		i=s1.nextInt();
		System.out.println("Enter the second value");
		s=s1.nextInt();
		c=i+s;
		System.out.println("Addition is:"+c);
		c=i-s;
		System.out.println("Subtraction is:"+c);
		c=i*s;
		System.out.println("Multiplication is:"+c);
		c=i/s;
		System.out.println("Divison is:"+c);
		c=i%s;
		System.out.println("Modulus is:"+c);
	}
}