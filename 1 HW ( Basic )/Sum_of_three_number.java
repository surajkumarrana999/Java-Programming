import java.util.*;
class Sum_of_three_number
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		int a,b,c,sum;
		System.out.println("Enter Three Number");
		a=input.nextInt();
		b=input.nextInt();
		c=input.nextInt();
		System.out.println("Value of a		:"+a);
		System.out.println("Value of b		:"+b);
		System.out.println("Value of c		:"+c);
		sum=a+b+c;
		System.out.println("Sum of three no.	:"+sum);
		input.close();
	}
}